/**
 * @description 查询当前地图怪物爆率
 * @author xxzixuan@outlook.com
 */

var status = -1;

function start() {
    action(1, 0, 0);
}

function action(mode, type, selection) {
    if (mode == 1) {
        status++;
    } else if (mode == 0 && status != 0) {
        status--;
    } else {
        cm.dispose();
        return;
    }
    
    if (status == 0) {
        var mobIdSet = cm.getMap().getAllUniqueMonsters();
        if (mobIdSet.size() <= 0) {
            cm.sendOk("当前地图沒有怪物数据。");
            cm.dispose();
            return;
        }
        var selStr = "请选择你想查询的怪物。\r\n\r\n#b";
        var iterator = mobIdSet.iterator();
        while (iterator.hasNext()) {
            var mobid = iterator.next();
            selStr += "#L" + mobid + "##o" + mobid + "##l\r\n";
        }
        cm.sendSimple(selStr);
    } else if (status == 1) {
        cm.sendOk(cm.checkDrop(selection));
        cm.dispose();
    }
}