/**
 * 名称：系统救援
 * 作者：Magical-H
 * 功能：通过检测异常信息并尝试进行解救，如卡地图解救（已完成）
 *      发型、脸型异常解救（未开发）
 */
package org.gms.server;


import lombok.Getter;
import org.gms.client.Character;
import org.gms.client.Client;
import org.gms.config.GameConfig;
import org.gms.util.I18nUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Getter
public class SystemRescue {
    private static final Logger log = LoggerFactory.getLogger(Client.class);
    private static final List<Integer> MapIdList = Arrays.asList(100000000, 101000000, 102000000, 103000000, 104000000);   //射手村，魔法密林，勇士部落，废弃都市，明珠港
    private static final String Lebel = I18nUtil.getLogMessage("SystemRescue.info.map.label") + " ";
    private static boolean isChangeChanneling = false;
    private static boolean isChangeMaping = false;

    /**
     * 卡地图救援，将某个倒霉蛋解救到其它地图。
     * @param player 传入玩家角色
     */
    public void setMapChange(Character player) {
        log.info("判断卡地图");
        if (player == null) return;   // 预防空指针

        int MapId = GameConfig.getServerInt("system_rescue_maperror_changeid");    // 该参数为控制台配置，设置地图ID大于0则启用。设置不存在的ID则改为随机传送到金银岛某个城镇。
        if (MapId <= 0) return;  // 如果 MapId 不大于0，直接返回

        if (isChangeMaping) {
            int MapId_error = -1;
            String MapName_error = I18nUtil.getLogMessage("SystemRescue.info.map.message1");
            boolean Map_exists = false;

            try {
                MapId_error = player.getMapId();       // 读取出错地图ID
                // 读取出错地图名称，这里是读取服务端String.wz地图名称，不存在则设为 未知地图
                MapName_error = player.getMap().getMapName().isEmpty() ? MapName_error : player.getMap().getMapName();
            } catch (Exception ignored) {}

            try {
                // 如果异常掉线地图和设置的救援地图一致 或者 地图名称为空  或者  地图文件wz不存在则会报错
                Map_exists = MapId != MapId_error && !player.getWarpMap(MapId).getMapName().isEmpty();
            } catch (Exception ignored) {}

            // 如果转移地图不存在，随机选择一个新的地图ID
            if (!Map_exists) {
                List<Integer> filteredList = new ArrayList<>(MapIdList);
                filteredList.remove(Integer.valueOf(MapId)); // 移除当前的MapId
                if (!filteredList.isEmpty()) {
                    log.warn(Lebel + I18nUtil.getLogMessage("SystemRescue.warn.map.message3"), MapId);
                    Random random = new Random();
                    MapId = filteredList.get(random.nextInt(filteredList.size()));
                }
            }
            //考虑到可能会出现地图文件改错改坏造成的闪退，因此不判定地图是否存在再进行转移。
            player.changeMap(MapId);    // 更改角色地图ID，之后才可以执行下方的读取转移后的地图信息。
            String MapName = player.getMap().getMapName();
            String Message_system = I18nUtil.getMessage("SystemRescue.map.message1", MapName_error, MapName);
            player.getAbstractPlayerInteraction().saveOrUpdateCharacterExtendValue("系统救援_卡地图_系统通知", Message_system, true);
            log.info(Lebel + I18nUtil.getLogMessage("SystemRescue.info.map.message2"), player.getName(), MapName_error, MapId_error, MapName, MapId);
        }
    }

    /**
     * 设置切换频道状态，用于在切换频道时掉线进行卡地图判断
     * @param state true：正在切换频道，false：已完成切换
     */
    public void setChangeChannelState(boolean state){
        log.info("切换频道状态" + state);
        isChangeChanneling = state;
    }
    /**
     * 设置切换频道状态，用于在切换频道时掉线进行卡地图判断
     * @param state true：正在切换频道，false：已完成切换
     */
    public void setChangeMapState(boolean state){
        log.info("切换地图状态" + state);
        isChangeMaping = state;
    }
    /**
     * 卡地图救援：玩家重新上线后会收到提示信息。
     * @param player 传入玩家角色
     */
    public void showMapChange(Character player) {
        try {
            if (player == null) return;   //预防空指针
            //聊天窗口红色提示
            if (DropMessage(player, "系统救援_卡地图_系统通知", 5)) {
                String Message = I18nUtil.getMessage("SystemRescue.map.message2");
                if (!Message.isEmpty()) {
                    //卡地图救援提示判断，弹窗
                    player.dropMessage(1, Message);
                }
            }
        } catch (Throwable e) {
            log.warn(Lebel + I18nUtil.getLogMessage("SystemRescue.warn.map.message2"),e);
        }
    }

    /**
     * 处理玩家的消息掉落。
     *
     * @param player 玩家对象。
     * @param keyname 存储消息的键名。
     * @param type 消息类型。
     * @return 如果成功处理消息返回 true，否则返回 false。
     */
    private Boolean DropMessage(Character player,String keyname,int type) {
        if(player == null || keyname == null || keyname.isEmpty()) return false;  //预防空指针
        String Message = player.getAbstractPlayerInteraction().getCharacterExtendValue(keyname, true);      //从玩家扩展表里提取指定键值
        if(Message != null && Message.length() > 1) {
            player.dropMessage(type,Message);       //给指定玩家发送消息
            player.getAbstractPlayerInteraction().saveOrUpdateCharacterExtendValue(keyname, "", true);      //设置指定键值为空
            return true;
        }
        return false;
    }
}
