package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class InventoryitemsDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final InventoryitemsDOTableDef INVENTORYITEMS_D_O = new InventoryitemsDOTableDef();

    public final QueryColumn FLAG = new QueryColumn(this, "flag");

    public final QueryColumn TYPE = new QueryColumn(this, "type");

    public final QueryColumn OWNER = new QueryColumn(this, "owner");

    public final QueryColumn PETID = new QueryColumn(this, "petid");

    public final QueryColumn ITEMID = new QueryColumn(this, "itemid");

    public final QueryColumn GIFT_FROM = new QueryColumn(this, "giftFrom");

    public final QueryColumn POSITION = new QueryColumn(this, "position");

    public final QueryColumn QUANTITY = new QueryColumn(this, "quantity");

    public final QueryColumn ACCOUNTID = new QueryColumn(this, "accountid");

    public final QueryColumn EXPIRATION = new QueryColumn(this, "expiration");

    public final QueryColumn CHARACTERID = new QueryColumn(this, "characterid");

    public final QueryColumn INVENTORYTYPE = new QueryColumn(this, "inventorytype");

    public final QueryColumn INVENTORYITEMID = new QueryColumn(this, "inventoryitemid");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{FLAG, TYPE, OWNER, PETID, ITEMID, GIFT_FROM, POSITION, QUANTITY, ACCOUNTID, EXPIRATION, CHARACTERID, INVENTORYTYPE, INVENTORYITEMID};

    public InventoryitemsDOTableDef() {
        super("", "inventoryitems");
    }

    private InventoryitemsDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public InventoryitemsDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new InventoryitemsDOTableDef("", "inventoryitems", alias));
    }

}
