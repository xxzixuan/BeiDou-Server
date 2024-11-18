package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class MtsItemsDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final MtsItemsDOTableDef MTS_ITEMS_D_O = new MtsItemsDOTableDef();

    public final QueryColumn HP = new QueryColumn(this, "hp");

    public final QueryColumn ID = new QueryColumn(this, "id");

    public final QueryColumn MP = new QueryColumn(this, "mp");

    public final QueryColumn ACC = new QueryColumn(this, "acc");

    public final QueryColumn DEX = new QueryColumn(this, "dex");

    public final QueryColumn LUK = new QueryColumn(this, "luk");

    public final QueryColumn STR = new QueryColumn(this, "str");

    public final QueryColumn TAB = new QueryColumn(this, "tab");

    public final QueryColumn FLAG = new QueryColumn(this, "flag");

    public final QueryColumn INTE = new QueryColumn(this, "int");

    public final QueryColumn JUMP = new QueryColumn(this, "jump");

    public final QueryColumn MATK = new QueryColumn(this, "matk");

    public final QueryColumn MDEF = new QueryColumn(this, "mdef");

    public final QueryColumn TYPE = new QueryColumn(this, "type");

    public final QueryColumn WATK = new QueryColumn(this, "watk");

    public final QueryColumn WDEF = new QueryColumn(this, "wdef");

    public final QueryColumn AVOID = new QueryColumn(this, "avoid");

    public final QueryColumn HANDS = new QueryColumn(this, "hands");

    public final QueryColumn LEVEL = new QueryColumn(this, "level");

    public final QueryColumn OWNER = new QueryColumn(this, "owner");

    public final QueryColumn PRICE = new QueryColumn(this, "price");

    public final QueryColumn SPEED = new QueryColumn(this, "speed");

    public final QueryColumn BUY_NOW = new QueryColumn(this, "buy_now");

    public final QueryColumn ITEMID = new QueryColumn(this, "itemid");

    public final QueryColumn LOCKED = new QueryColumn(this, "locked");

    public final QueryColumn RINGID = new QueryColumn(this, "ringid");

    public final QueryColumn SELLER = new QueryColumn(this, "seller");

    public final QueryColumn ISEQUIP = new QueryColumn(this, "isequip");

    public final QueryColumn ITEMEXP = new QueryColumn(this, "itemexp");

    public final QueryColumn VICIOUS = new QueryColumn(this, "vicious");

    public final QueryColumn BID_INCRE = new QueryColumn(this, "bid_incre");

    public final QueryColumn GIFT_FROM = new QueryColumn(this, "giftFrom");

    public final QueryColumn POSITION = new QueryColumn(this, "position");

    public final QueryColumn QUANTITY = new QueryColumn(this, "quantity");

    public final QueryColumn SELL_ENDS = new QueryColumn(this, "sell_ends");

    public final QueryColumn TRANSFER = new QueryColumn(this, "transfer");

    public final QueryColumn ITEMLEVEL = new QueryColumn(this, "itemlevel");

    public final QueryColumn EXPIRATION = new QueryColumn(this, "expiration");

    public final QueryColumn SELLERNAME = new QueryColumn(this, "sellername");

    public final QueryColumn UPGRADESLOTS = new QueryColumn(this, "upgradeslots");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{HP, ID, MP, ACC, DEX, LUK, STR, TAB, FLAG, INTE, JUMP, MATK, MDEF, TYPE, WATK, WDEF, AVOID, HANDS, LEVEL, OWNER, PRICE, SPEED, BUY_NOW, ITEMID, LOCKED, RINGID, SELLER, ISEQUIP, ITEMEXP, VICIOUS, BID_INCRE, GIFT_FROM, POSITION, QUANTITY, SELL_ENDS, TRANSFER, ITEMLEVEL, EXPIRATION, SELLERNAME, UPGRADESLOTS};

    public MtsItemsDOTableDef() {
        super("", "mts_items");
    }

    private MtsItemsDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public MtsItemsDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new MtsItemsDOTableDef("", "mts_items", alias));
    }

}
