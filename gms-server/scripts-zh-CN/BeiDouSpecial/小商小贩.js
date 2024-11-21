/**
 * @description 查询当前地图怪物爆率
 * @author xxzixuan@outlook.com
 */

var coin = "#fUI/UIWindow/Shop/meso#"; //金币
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
    
    if (status <= 0) {  
        var selStr = "#h #，想买点什么呢？\r\n#d";
        selStr+="#L0#"+coin+"药水商店"+"#l\r\n\#L1#"+coin+"杂货商店"+"#l\r\n"; 
        cm.sendSimple(selStr);
    } else if (status == 1) {
        cm.message("dsfsfd");
        switch (selection) {
            case 0:
                cm.dispose();
                cm.openShopNPC(2080001);
                break;
            case 1:
                cm.dispose();
                cm.openShopNPC(2080002);
                break;
        }
    }
}