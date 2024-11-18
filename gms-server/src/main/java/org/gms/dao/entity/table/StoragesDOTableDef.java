package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class StoragesDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final StoragesDOTableDef STORAGES_D_O = new StoragesDOTableDef();

    public final QueryColumn MESO = new QueryColumn(this, "meso");

    public final QueryColumn SLOTS = new QueryColumn(this, "slots");

    public final QueryColumn WORLD = new QueryColumn(this, "world");

    public final QueryColumn ACCOUNTID = new QueryColumn(this, "accountid");

    public final QueryColumn STORAGEID = new QueryColumn(this, "storageid");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{MESO, SLOTS, WORLD, ACCOUNTID, STORAGEID};

    public StoragesDOTableDef() {
        super("", "storages");
    }

    private StoragesDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public StoragesDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new StoragesDOTableDef("", "storages", alias));
    }

}
