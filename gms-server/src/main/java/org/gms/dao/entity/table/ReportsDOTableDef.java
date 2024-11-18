package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class ReportsDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final ReportsDOTableDef REPORTS_D_O = new ReportsDOTableDef();

    public final QueryColumn ID = new QueryColumn(this, "id");

    public final QueryColumn REASON = new QueryColumn(this, "reason");

    public final QueryColumn CHATLOG = new QueryColumn(this, "chatlog");

    public final QueryColumn VICTIMID = new QueryColumn(this, "victimid");

    public final QueryColumn REPORTERID = new QueryColumn(this, "reporterid");

    public final QueryColumn REPORTTIME = new QueryColumn(this, "reporttime");

    public final QueryColumn DESCRIPTION = new QueryColumn(this, "description");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, REASON, CHATLOG, VICTIMID, REPORTERID, REPORTTIME, DESCRIPTION};

    public ReportsDOTableDef() {
        super("", "reports");
    }

    private ReportsDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public ReportsDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new ReportsDOTableDef("", "reports", alias));
    }

}
