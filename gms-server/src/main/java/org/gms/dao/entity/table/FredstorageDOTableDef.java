package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class FredstorageDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final FredstorageDOTableDef FREDSTORAGE_D_O = new FredstorageDOTableDef();

    public final QueryColumn ID = new QueryColumn(this, "id");

    public final QueryColumn CID = new QueryColumn(this, "cid");

    public final QueryColumn DAYNOTES = new QueryColumn(this, "daynotes");

    public final QueryColumn TIMESTAMP = new QueryColumn(this, "timestamp");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, CID, DAYNOTES, TIMESTAMP};

    public FredstorageDOTableDef() {
        super("", "fredstorage");
    }

    private FredstorageDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public FredstorageDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new FredstorageDOTableDef("", "fredstorage", alias));
    }

}
