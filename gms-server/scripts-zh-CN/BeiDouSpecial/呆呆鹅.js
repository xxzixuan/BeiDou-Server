/**
 * @description 拍卖小助手
 * @author xxzixuan@outlook.com
 */

var status = -1;
var itemId = 2022615;

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
        var context = "#h #，我是呆呆鹅。很乐意为你效劳！";
        context += "\r\n#L1#领取拍卖箱子(默认设置在键盘的F12，可以快速打开菜单)#l";
        cm.sendSimple(context);
    } else if (status == 1) {
        if (selection == 1) {
            if (cm.getInventory(2).isFull()) {
                cm.sendOk("请保证背包#b消耗栏#k至少有 #r1 #k个位置");
                cm.dispose();
                return;
            }
            if (cm.haveItem(itemId,1)) {
                cm.sendOk("你已经有一个拍卖箱子了。如果遗失了，可以再来找我领取。");
                cm.dispose();
                return;
            }            
            
            cm.gainItem(itemId, 1);
            cm.putKey(88, 2, itemId);
            cm.sendOk("拍卖箱子已经发放到你的消耗品栏，并设置到了F12键上，你可以将它更换到其它键上。按该键快速打开菜单。");
            cm.dispose();
        }
    }

}