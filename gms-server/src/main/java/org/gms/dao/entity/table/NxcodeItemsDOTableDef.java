package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class NxcodeItemsDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final NxcodeItemsDOTableDef NXCODE_ITEMS_D_O = new NxcodeItemsDOTableDef();

    public final QueryColumn ID = new QueryColumn(this, "id");

    public final QueryColumn ITEM = new QueryColumn(this, "item");

    public final QueryColumn TYPE = new QueryColumn(this, "type");

    public final QueryColumn CODEID = new QueryColumn(this, "codeid");

    public final QueryColumn QUANTITY = new QueryColumn(this, "quantity");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, ITEM, TYPE, CODEID, QUANTITY};

    public NxcodeItemsDOTableDef() {
        super("", "nxcode_items");
    }

    private NxcodeItemsDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public NxcodeItemsDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new NxcodeItemsDOTableDef("", "nxcode_items", alias));
    }

}
