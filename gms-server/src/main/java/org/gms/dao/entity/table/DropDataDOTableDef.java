package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class DropDataDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final DropDataDOTableDef DROP_DATA_D_O = new DropDataDOTableDef();

    public final QueryColumn ID = new QueryColumn(this, "id");

    public final QueryColumn CHANCE = new QueryColumn(this, "chance");

    public final QueryColumn ITEMID = new QueryColumn(this, "itemid");

    public final QueryColumn QUESTID = new QueryColumn(this, "questid");

    public final QueryColumn DROPPERID = new QueryColumn(this, "dropperid");

    public final QueryColumn MAXIMUM_QUANTITY = new QueryColumn(this, "maximum_quantity");

    public final QueryColumn MINIMUM_QUANTITY = new QueryColumn(this, "minimum_quantity");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, CHANCE, ITEMID, QUESTID, DROPPERID, MAXIMUM_QUANTITY, MINIMUM_QUANTITY};

    public DropDataDOTableDef() {
        super("", "drop_data");
    }

    private DropDataDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public DropDataDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new DropDataDOTableDef("", "drop_data", alias));
    }

}
