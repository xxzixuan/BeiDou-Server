/**
 * @description 查询道具由哪些怪物掉落
 * @author xxzixuan@outlook.com
 */

var status = -1;
var h1 = -1;
var h2 = -1;

function start() {
    action(1, 0, 0);
}

function action(mode, type, selection) {
    if (mode == 1) {
        status++;
    } else {
        if (status >= 1 || status == 0) {
            cm.dispose();
            return;
        }
        status--;
    }
    
    if (status == 0) {
        cm.sendGetText("请输入想查询道具:");
    } else if (status == 1) {
        cm.sendOk(cm.whoDrops(cm.getText()));
        cm.dispose();
    } else {
        cm.dispose();
    }
}
