package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class InventorymerchantDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final InventorymerchantDOTableDef INVENTORYMERCHANT_D_O = new InventorymerchantDOTableDef();

    public final QueryColumn BUNDLES = new QueryColumn(this, "bundles");

    public final QueryColumn CHARACTERID = new QueryColumn(this, "characterid");

    public final QueryColumn INVENTORYITEMID = new QueryColumn(this, "inventoryitemid");

    public final QueryColumn INVENTORYMERCHANTID = new QueryColumn(this, "inventorymerchantid");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{BUNDLES, CHARACTERID, INVENTORYITEMID, INVENTORYMERCHANTID};

    public InventorymerchantDOTableDef() {
        super("", "inventorymerchant");
    }

    private InventorymerchantDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public InventorymerchantDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new InventorymerchantDOTableDef("", "inventorymerchant", alias));
    }

}
