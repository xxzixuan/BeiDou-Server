package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class FamelogDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final FamelogDOTableDef FAMELOG_D_O = new FamelogDOTableDef();

    public final QueryColumn WHEN = new QueryColumn(this, "when");

    public final QueryColumn FAMELOGID = new QueryColumn(this, "famelogid");

    public final QueryColumn CHARACTERID = new QueryColumn(this, "characterid");

    public final QueryColumn CHARACTERID_TO = new QueryColumn(this, "characterid_to");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{WHEN, FAMELOGID, CHARACTERID, CHARACTERID_TO};

    public FamelogDOTableDef() {
        super("", "famelog");
    }

    private FamelogDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public FamelogDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new FamelogDOTableDef("", "famelog", alias));
    }

}
