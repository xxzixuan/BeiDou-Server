package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class DueypackagesDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final DueypackagesDOTableDef DUEYPACKAGES_D_O = new DueypackagesDOTableDef();

    public final QueryColumn TYPE = new QueryColumn(this, "type");

    public final QueryColumn MESOS = new QueryColumn(this, "mesos");

    public final QueryColumn CHECKED = new QueryColumn(this, "checked");

    public final QueryColumn MESSAGE = new QueryColumn(this, "message");

    public final QueryColumn PACKAGEID = new QueryColumn(this, "packageid");

    public final QueryColumn TIMESTAMP = new QueryColumn(this, "timestamp");

    public final QueryColumn RECEIVERID = new QueryColumn(this, "receiverid");

    public final QueryColumn SENDERNAME = new QueryColumn(this, "sendername");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{TYPE, MESOS, CHECKED, MESSAGE, PACKAGEID, TIMESTAMP, RECEIVERID, SENDERNAME};

    public DueypackagesDOTableDef() {
        super("", "dueypackages");
    }

    private DueypackagesDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public DueypackagesDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new DueypackagesDOTableDef("", "dueypackages", alias));
    }

}
