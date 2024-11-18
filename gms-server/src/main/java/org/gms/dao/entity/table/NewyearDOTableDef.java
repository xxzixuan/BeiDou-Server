package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class NewyearDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final NewyearDOTableDef NEWYEAR_D_O = new NewyearDOTableDef();

    public final QueryColumn ID = new QueryColumn(this, "id");

    public final QueryColumn MESSAGE = new QueryColumn(this, "message");

    public final QueryColumn RECEIVED = new QueryColumn(this, "received");

    public final QueryColumn SENDERID = new QueryColumn(this, "senderid");

    public final QueryColumn TIMESENT = new QueryColumn(this, "timesent");

    public final QueryColumn RECEIVERID = new QueryColumn(this, "receiverid");

    public final QueryColumn SENDERNAME = new QueryColumn(this, "sendername");

    public final QueryColumn RECEIVERNAME = new QueryColumn(this, "receivername");

    public final QueryColumn TIMERECEIVED = new QueryColumn(this, "timereceived");

    public final QueryColumn SENDERDISCARD = new QueryColumn(this, "senderdiscard");

    public final QueryColumn RECEIVERDISCARD = new QueryColumn(this, "receiverdiscard");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, MESSAGE, RECEIVED, SENDERID, TIMESENT, RECEIVERID, SENDERNAME, RECEIVERNAME, TIMERECEIVED, SENDERDISCARD, RECEIVERDISCARD};

    public NewyearDOTableDef() {
        super("", "newyear");
    }

    private NewyearDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public NewyearDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new NewyearDOTableDef("", "newyear", alias));
    }

}
