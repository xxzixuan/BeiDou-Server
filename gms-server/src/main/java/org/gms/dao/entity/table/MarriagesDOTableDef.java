package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class MarriagesDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final MarriagesDOTableDef MARRIAGES_D_O = new MarriagesDOTableDef();

    public final QueryColumn WIFEID = new QueryColumn(this, "wifeid");

    public final QueryColumn HUSBANDID = new QueryColumn(this, "husbandid");

    public final QueryColumn MARRIAGEID = new QueryColumn(this, "marriageid");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{WIFEID, HUSBANDID, MARRIAGEID};

    public MarriagesDOTableDef() {
        super("", "marriages");
    }

    private MarriagesDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public MarriagesDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new MarriagesDOTableDef("", "marriages", alias));
    }

}
