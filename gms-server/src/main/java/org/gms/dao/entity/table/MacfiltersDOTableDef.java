package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class MacfiltersDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final MacfiltersDOTableDef MACFILTERS_D_O = new MacfiltersDOTableDef();

    public final QueryColumn FILTER = new QueryColumn(this, "filter");

    public final QueryColumn MACFILTERID = new QueryColumn(this, "macfilterid");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{FILTER, MACFILTERID};

    public MacfiltersDOTableDef() {
        super("", "macfilters");
    }

    private MacfiltersDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public MacfiltersDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new MacfiltersDOTableDef("", "macfilters", alias));
    }

}
