/**
 * @description 学习当前职业阶段(job)的所有技能
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
        cm.teachSkillsCurrentJob();
        var context = "#h #，好啦，打开你的技能(k)看看吧！";
        cm.sendSimple(context);
    }
    cm.dispose();
    return;
}