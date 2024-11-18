package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class WorldtransfersDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final WorldtransfersDOTableDef WORLDTRANSFERS_D_O = new WorldtransfersDOTableDef();

    public final QueryColumn ID = new QueryColumn(this, "id");

    public final QueryColumn TO = new QueryColumn(this, "to");

    public final QueryColumn FROM = new QueryColumn(this, "from");

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
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, TO, FROM, CHARACTERID, REQUEST_TIME, COMPLETION_TIME};

    public WorldtransfersDOTableDef() {
        super("", "worldtransfers");
    }

    private WorldtransfersDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public WorldtransfersDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new WorldtransfersDOTableDef("", "worldtransfers", alias));
    }

}
