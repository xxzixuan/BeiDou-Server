/*
	This file is part of the OdinMS Maple Story Server
    Copyright (C) 2008 Patrick Huy <patrick.huy@frz.cc>
		       Matthias Butz <matze@odinms.de>
		       Jan Christian Meyer <vimes@odinms.de>

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as
    published by the Free Software Foundation version 3 as published by
    the Free Software Foundation. You may not use, modify or distribute
    this program under any other version of the GNU Affero General Public
    License.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

/**
 * @description 拍卖行中心脚本
 */
var LifeFactory = Java.type('org.gms.server.life.LifeFactory');

var BeiDouUI ="#fMap/MapHelper.img/BeiDou/logo#";
var BlueShine = "#fUI/GuildMark.img/Mark/Pattern/00004001/10#";
var OldTitle ="\t\t\t\t\t\t\t欢迎来到呆呆鹅冒险岛#n\t\t\t\t\r\n";
var status = -1;
var i = 0;
function start() {
    action(1, 0, 0)
}

function action(mode, type, selection) {
    if (mode === 1) {
        status++;
    } else if (mode === -1) {
        status--;
    } else {
        cm.dispose();
        return;
    }

    if (status === 0) {
		//var TextTitle = BlueShine;
		//for (i =0;i < 5; i++) 
		//TextTitle += BlueShine; 
        //let text = TextTitle + BeiDouUI + TextTitle + "\r\n";
		//text +=BlueShine + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + BlueShine + "\r\n";
        //text +=BlueShine + "\t\t\t\t\t#e欢迎来到#rBeiDou#k脚本中心#n\t\t\t\t" + BlueShine + "\r\n";
		//text +=BlueShine + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + BlueShine + "\r\n";
		//text +=BlueShine + TextTitle + TextTitle + TextTitle + "\r\n\r\n";
		let text = OldTitle;
        text += "\t点券：" + cm.getPlayer().getCashShop().getCash(1) + "\r\n";
        text += "抵用券：" + cm.getPlayer().getCashShop().getCash(2) + "\r\n";
        text += "信用券：" + cm.getPlayer().getCashShop().getCash(4) + "\r\n";
        text += " \r\n";
        text += "#L0#萌新福利#l \t #L1#每日签到#l \t #L2#在线奖励#l\r\n";
        text += "#L3#鹅鹅打车#l \t #L5#自由市场#l \t #L6#附近村落#l\r\n";
		text += "#L7#战神学技#l \t #L8#整理背包#l \t #L9#呆呆鹅#l\r\n";
        text += "#L10#小商小贩#l\t #L11#怪物爆率#l\t #L12#掉落查询#l\r\n";
        text += "#L13#我的仓库#l\t #L14#三只宠物#l\t \r\n";
        
        if (cm.getPlayer().getMap().getId() == '104000004' && cm.getPlayer().getJob() == 'ARAN2') {
          text += "#L4#精准矛(补偿)#l\r\n";          
        }
        
        if (cm.getPlayer().isGM()) {
            text += "\r\n\r\n";
            text += "\t\t\t\t#r=====以下内容仅GM可见=====\r\n";
            text += "#L61#超级传送#l \t #L62#超级商店#l \t #L63#整容集合#l\r\n\r\n";
			text += "#L64#UI查询#l \t #L65#一键删除道具#l \t #L66#一键刷道具#l\r\n\r\n";
			text += "#L67#有状态脚本示例#l \t #L68#NextLevel脚本示例#l";
        }
        cm.sendSimple(text);
    } else if (status === 1) {
        doSelect(selection);
    } else {
        cm.dispose();
    }
}

function doSelect(selection) {
    switch (selection) {
        // 非GM功能
        case 0:
            openNpc("新人福利");
            break;
        case 1:
            openNpc("每日签到");
            break;
        case 2:
            openNpc("在线奖励");
            break;
        case 3:
            openNpc("万能传送");
           //cm.getPlayer().saveLocation("FREE_MARKET");
           // cm.warp(910000000, "out00");
            break;
        case 5:            
            cm.warp(910000000, 0);
            cm.dispose();
            break; 
        case 6:
            cm.gainMeso(-5000);            
            var returnMapId = cm.getMap().getReturnMap().getId();
            cm.warp(returnMapId, 0);
            cm.dispose();
            break;
		case 7:
            openNpc("习得当前职业技能");
            break;
        case 8:
            openNpc("清包");
            break;
        case 9:
            openNpc("呆呆鹅");
            break;
        case 10:
            openNpc("小商小贩");
            break;
        case 11:
            openNpc("怪物爆率");
            break;
        case 12:
            openNpc("掉落查询");
            break;
        case 13:
            cm.dispose();
            cm.openNpc(9030100);
            break;
        case 14:
            if (!cm.haveItem(5460000)) {
              cm.sendOk("带一个宠物点心，再来找我！");
              cm.dispose();
              break;
            }
            cm.gainItem(5460000, -1);
            cm.teachSkill(8, 1, 1, -1);
            cm.teachSkill(10000018, 1, 1, -1);
            cm.teachSkill(20000024, 1, 1, -1);
            cm.sendOk("怎么样？带三只宠物是不是很炫酷？。");
            cm.dispose();
            break;
        // GM功能
        case 61:
            openNpc("万能传送");
            //cm.sendOk("该功能暂不支持，敬请期待！");
            //cm.dispose();
            break;
        case 62:
            // openNpc("SuperShop");
            cm.sendOk("该功能暂不支持，敬请期待！");
            cm.dispose();
            break;
        case 63:
            openNpc("Salon");
            break;
        case 64:
            openNpc("UI查询");
            break;	
        case 65:
            openNpc("一键删除道具");
            break;
        case 66:
            openNpc("一键刷道具");
            break;
        case 67:
            openNpc("Example1")
            break;
        case 68:
            openNpc("Example2")
            break;
        case 4:
            var mobId = 9300345;
            var level = cm.getLevel();
            if (level > 37) {
              mobId = 9300346;
            }            
            cm.getPlayer().getMap().spawnMonsterOnGroundBelow(LifeFactory.getMonster(mobId), cm.getPlayer().getPosition());
            
            cm.sendOk("已补偿！");
            cm.dispose();
            break;
        default:
            cm.sendOk("该功能暂不支持，敬请期待！");
            cm.dispose();
    }
}

function openNpc(scriptName) {
    cm.dispose();
    cm.openNpc(9900001, scriptName);
}