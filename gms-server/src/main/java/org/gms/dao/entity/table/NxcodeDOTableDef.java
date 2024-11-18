package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class NxcodeDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final NxcodeDOTableDef NXCODE_D_O = new NxcodeDOTableDef();

    public final QueryColumn ID = new QueryColumn(this, "id");

    public final QueryColumn CODE = new QueryColumn(this, "code");

    public final QueryColumn RETRIEVER = new QueryColumn(this, "retriever");

    public final QueryColumn EXPIRATION = new QueryColumn(this, "expiration");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, CODE, RETRIEVER, EXPIRATION};

    public NxcodeDOTableDef() {
        super("", "nxcode");
    }

    private NxcodeDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public NxcodeDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new NxcodeDOTableDef("", "nxcode", alias));
    }

}
