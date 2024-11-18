package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class ServerQueueDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final ServerQueueDOTableDef SERVER_QUEUE_D_O = new ServerQueueDOTableDef();

    public final QueryColumn ID = new QueryColumn(this, "id");

    public final QueryColumn TYPE = new QueryColumn(this, "type");

    public final QueryColumn VALUE = new QueryColumn(this, "value");

    public final QueryColumn MESSAGE = new QueryColumn(this, "message");

    public final QueryColumn ACCOUNTID = new QueryColumn(this, "accountid");

    public final QueryColumn CREATE_TIME = new QueryColumn(this, "createTime");

    public final QueryColumn CHARACTERID = new QueryColumn(this, "characterid");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, TYPE, VALUE, MESSAGE, ACCOUNTID, CREATE_TIME, CHARACTERID};

    public ServerQueueDOTableDef() {
        super("", "server_queue");
    }

    private ServerQueueDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public ServerQueueDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new ServerQueueDOTableDef("", "server_queue", alias));
    }

}
