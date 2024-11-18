package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class InventoryequipmentDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final InventoryequipmentDOTableDef INVENTORYEQUIPMENT_D_O = new InventoryequipmentDOTableDef();

    public final QueryColumn HP = new QueryColumn(this, "hp");

    public final QueryColumn MP = new QueryColumn(this, "mp");

    public final QueryColumn ACC = new QueryColumn(this, "acc");

    public final QueryColumn DEX = new QueryColumn(this, "dex");

    public final QueryColumn LUK = new QueryColumn(this, "luk");

    public final QueryColumn STR = new QueryColumn(this, "str");

    public final QueryColumn INTE = new QueryColumn(this, "int");

    public final QueryColumn JUMP = new QueryColumn(this, "jump");

    public final QueryColumn MATK = new QueryColumn(this, "matk");

    public final QueryColumn MDEF = new QueryColumn(this, "mdef");

    public final QueryColumn WATK = new QueryColumn(this, "watk");

    public final QueryColumn WDEF = new QueryColumn(this, "wdef");

    public final QueryColumn AVOID = new QueryColumn(this, "avoid");

    public final QueryColumn HANDS = new QueryColumn(this, "hands");

    public final QueryColumn LEVEL = new QueryColumn(this, "level");

    public final QueryColumn SPEED = new QueryColumn(this, "speed");

    public final QueryColumn LOCKED = new QueryColumn(this, "locked");

    public final QueryColumn RINGID = new QueryColumn(this, "ringid");

    public final QueryColumn ITEMEXP = new QueryColumn(this, "itemexp");

    public final QueryColumn VICIOUS = new QueryColumn(this, "vicious");

    public final QueryColumn ITEMLEVEL = new QueryColumn(this, "itemlevel");

    public final QueryColumn UPGRADESLOTS = new QueryColumn(this, "upgradeslots");

    public final QueryColumn INVENTORYITEMID = new QueryColumn(this, "inventoryitemid");

    public final QueryColumn INVENTORYEQUIPMENTID = new QueryColumn(this, "inventoryequipmentid");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{HP, MP, ACC, DEX, LUK, STR, INTE, JUMP, MATK, MDEF, WATK, WDEF, AVOID, HANDS, LEVEL, SPEED, LOCKED, RINGID, ITEMEXP, VICIOUS, ITEMLEVEL, UPGRADESLOTS, INVENTORYITEMID, INVENTORYEQUIPMENTID};

    public InventoryequipmentDOTableDef() {
        super("", "inventoryequipment");
    }

    private InventoryequipmentDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public InventoryequipmentDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new InventoryequipmentDOTableDef("", "inventoryequipment", alias));
    }

}
