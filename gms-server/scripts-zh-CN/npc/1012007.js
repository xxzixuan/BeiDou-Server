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

/* Author: Xterminator
	NPC Name: 		Trainer Frod
	Map(s): 		Victoria Road : Pet-Walking Road (100000202)
	Description: 		Pet Trainer
*/

var status = -1;
var xx;

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
		if (cm.haveItem(4031035)) {
			cm.sendNext("嗯，那是我哥的信！可能是在责备我觉得自己没在工作之类的事情...嗯？啊...你听从我哥的建议，训练了你的宠物并且到了这里，是吧？太棒了！既然你为了到这里努力了，我会提高你和宠物的亲密度等级。");
			xx = 1;
		} else if (cm.haveItem(5460000) && cm.haveItem(4031922, 8)) {
			cm.sendNext("哎呦~ 是我那哥哥叫你来的吧！他又怪我不工作贪玩了吧？嗯？啊~ 你按我哥说的，一路上带着宠物一起上来的吗？好！你这么辛苦地上来了，我可以让你带三只宠物。");
			xx = 2;
		} else {
			cm.sendOk("我哥叫我照顾宠物障碍赛道，但是……因为我离他太远了，我忍不住想要四处闲逛……嘿嘿，既然看不见他，那就随便放松几分钟吧。");
			cm.dispose();
		}
	} else if (status == 1) {
		if (cm.getPlayer().getNoPets() == 0) {
			cm.sendNextPrev("嗯... 你真的带着你的宠物来到这里吗？这些障碍是为宠物准备的。你没有宠物来这里干什么？快离开这儿！");
		}
		if (xx == 1) {
			cm.gainItem(4031035, -1);
			cm.gainItem(4031922, 8);
			cm.gainTameness(2);
			cm.sendOk("你怎麽看？难道你不认为你已经得到了你的宠物更接近？如果你有时间，再训练你的宠物在这个障碍......当然当然，我的兄弟的许可。");
			cm.dispose();
		} else if (xx == 2) {
			cm.gainItem(5460000, -1);
			cm.gainItem(4031922, -8);
			cm.teachSkill(8, 1, 1, -1);
			cm.sendOk("怎么样？带三只宠物是不是很炫酷？。");
			cm.dispose();
		}
	}
}