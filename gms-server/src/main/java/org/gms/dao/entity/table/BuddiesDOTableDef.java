package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class BuddiesDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final BuddiesDOTableDef BUDDIES_D_O = new BuddiesDOTableDef();

    public final QueryColumn ID = new QueryColumn(this, "id");

    public final QueryColumn GROUP = new QueryColumn(this, "group");

    public final QueryColumn BUDDYID = new QueryColumn(this, "buddyid");

    public final QueryColumn PENDING = new QueryColumn(this, "pending");

    public final QueryColumn CHARACTERID = new QueryColumn(this, "characterid");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, GROUP, BUDDYID, PENDING, CHARACTERID};

    public BuddiesDOTableDef() {
        super("", "buddies");
    }

    private BuddiesDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public BuddiesDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new BuddiesDOTableDef("", "buddies", alias));
    }

}
