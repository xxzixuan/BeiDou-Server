/**
 * @description 清理背包
 * @author xxzixuan@outlook.com
 */
var ItemInformationProvider = Java.type('org.gms.server.ItemInformationProvider');
var BtRight = "#fUI/UIWindow/itemSearch/BtRight/normal/0#";
var status = -1;
var itemss;
var slot = Array();
var inventoryType = Array(
	Array(1, "装备栏"),
    Array(2, "消耗栏"),
    Array(3, "设置栏"),
    Array(4, "其它栏"),
    Array(5, "特殊栏")
);

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
        var text = "#h #，整理背包吧~#d\r\n";
        inventoryType.forEach(function(item, index) {
            text += "#L"+index+"#" + BtRight + inventoryType[index][1] + "#l\r\n";
        });
        cm.sendSimple(text);
    } else if (status == 1) {
        cm.dispose();
        cm.openNpc(9900001, "清理"+inventoryType[selection][1]);
    } else {
        cm.dispose();
    }
}