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
        var jobId = cm.getJobId();
        if (!(jobId >= 2100 && jobId <= 2112)) {
            cm.sendOk("#h #，升到10级后，再来找我吧！我将一路陪伴你，教你如何成为一位神采奕奕的战神~");
            cm.dispose();            
            return;
        }
        cm.teachSkillsCurrentJob();
        cm.sendOk("#h #，好啦，打开你的技能(k)看看吧！");
    }
    cm.dispose();
}