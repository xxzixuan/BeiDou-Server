/**
 * @description 清理背包
 * @author xxzixuan@outlook.com
 */
var ItemInformationProvider = Java.type('org.gms.server.ItemInformationProvider');
var BtRight = "#fUI/UIWindow/itemSearch/BtRight/normal/0#";
var status = -1;
var inventoryType = 3;
var itemss;
var slot = Array();

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
        var avail = "";
        for (var i = 0; i < 96; i++) {
            if (cm.getInventory(inventoryType).getItem(i) != null) {
                var itemId = cm.getInventory(inventoryType).getItem(i).getItemId();
                avail += "#L" + itemId + "##v" + itemId + "#\t#z" + itemId + "#\r\n";
            }
            slot.push(i);
        }
        if (avail == "") {
            cm.sendOk("空空如也~");
            cm.dispose();
            return;
        }
        cm.sendSimple("#r提示：可连续清理。不要点下一步，直接点结束。\r\n#b" + avail);
    } else if (status == 1) {
        cm.message("select: " + selection);
        itemss = selection;
        cm.removeAll(itemss);
        cm.dispose();
        cm.openNpc(9900001, "清理设置栏");
    } else {
        cm.dispose();
    }
}