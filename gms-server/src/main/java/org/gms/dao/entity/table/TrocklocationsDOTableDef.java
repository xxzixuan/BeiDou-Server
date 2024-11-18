package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class TrocklocationsDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final TrocklocationsDOTableDef TROCKLOCATIONS_D_O = new TrocklocationsDOTableDef();

    public final QueryColumn VIP = new QueryColumn(this, "vip");

    public final QueryColumn MAPID = new QueryColumn(this, "mapid");

    public final QueryColumn TROCKID = new QueryColumn(this, "trockid");

    public final QueryColumn CHARACTERID = new QueryColumn(this, "characterid");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{VIP, MAPID, TROCKID, CHARACTERID};

    public TrocklocationsDOTableDef() {
        super("", "trocklocations");
    }

    private TrocklocationsDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public TrocklocationsDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new TrocklocationsDOTableDef("", "trocklocations", alias));
    }

}
