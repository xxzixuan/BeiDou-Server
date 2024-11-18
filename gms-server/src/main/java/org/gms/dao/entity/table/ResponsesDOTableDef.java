package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class ResponsesDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final ResponsesDOTableDef RESPONSES_D_O = new ResponsesDOTableDef();

    public final QueryColumn ID = new QueryColumn(this, "id");

    public final QueryColumn CHAT = new QueryColumn(this, "chat");

    public final QueryColumn RESPONSE = new QueryColumn(this, "response");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, CHAT, RESPONSE};

    public ResponsesDOTableDef() {
        super("", "responses");
    }

    private ResponsesDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public ResponsesDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new ResponsesDOTableDef("", "responses", alias));
    }

}
