package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class DropDataGlobalDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final DropDataGlobalDOTableDef DROP_DATA_GLOBAL_D_O = new DropDataGlobalDOTableDef();

    public final QueryColumn ID = new QueryColumn(this, "id");

    public final QueryColumn CHANCE = new QueryColumn(this, "chance");

    public final QueryColumn ITEMID = new QueryColumn(this, "itemid");

    public final QueryColumn QUESTID = new QueryColumn(this, "questid");

    public final QueryColumn COMMENTS = new QueryColumn(this, "comments");

    public final QueryColumn CONTINENT = new QueryColumn(this, "continent");

    public final QueryColumn MAXIMUM_QUANTITY = new QueryColumn(this, "maximum_quantity");

    public final QueryColumn MINIMUM_QUANTITY = new QueryColumn(this, "minimum_quantity");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, CHANCE, ITEMID, QUESTID, COMMENTS, CONTINENT, MAXIMUM_QUANTITY, MINIMUM_QUANTITY};

    public DropDataGlobalDOTableDef() {
        super("", "drop_data_global");
    }

    private DropDataGlobalDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public DropDataGlobalDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new DropDataGlobalDOTableDef("", "drop_data_global", alias));
    }

}
