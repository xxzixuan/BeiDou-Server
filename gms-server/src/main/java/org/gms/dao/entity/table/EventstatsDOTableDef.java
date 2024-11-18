package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class EventstatsDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final EventstatsDOTableDef EVENTSTATS_D_O = new EventstatsDOTableDef();

    public final QueryColumn INFO = new QueryColumn(this, "info");

    /**
     * 0
     */
    public final QueryColumn NAME = new QueryColumn(this, "name");

    public final QueryColumn CHARACTERID = new QueryColumn(this, "characterid");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{INFO, NAME, CHARACTERID};

    public EventstatsDOTableDef() {
        super("", "eventstats");
    }

    private EventstatsDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public EventstatsDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new EventstatsDOTableDef("", "eventstats", alias));
    }

}
