package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class NamechangesDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final NamechangesDOTableDef NAMECHANGES_D_O = new NamechangesDOTableDef();

    public final QueryColumn ID = new QueryColumn(this, "id");

    public final QueryColumn NEWER = new QueryColumn(this, "new");

    public final QueryColumn OLDER = new QueryColumn(this, "old");

    public final QueryColumn CHARACTERID = new QueryColumn(this, "characterid");

    public final QueryColumn REQUEST_TIME = new QueryColumn(this, "requestTime");

    public final QueryColumn COMPLETION_TIME = new QueryColumn(this, "completionTime");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, NEWER, OLDER, CHARACTERID, REQUEST_TIME, COMPLETION_TIME};

    public NamechangesDOTableDef() {
        super("", "namechanges");
    }

    private NamechangesDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public NamechangesDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new NamechangesDOTableDef("", "namechanges", alias));
    }

}
