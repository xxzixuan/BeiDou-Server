package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class BosslogWeeklyDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final BosslogWeeklyDOTableDef BOSSLOG_WEEKLY_D_O = new BosslogWeeklyDOTableDef();

    public final QueryColumn ID = new QueryColumn(this, "id");

    public final QueryColumn BOSSTYPE = new QueryColumn(this, "bosstype");

    public final QueryColumn ATTEMPTTIME = new QueryColumn(this, "attempttime");

    public final QueryColumn CHARACTERID = new QueryColumn(this, "characterid");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, BOSSTYPE, ATTEMPTTIME, CHARACTERID};

    public BosslogWeeklyDOTableDef() {
        super("", "bosslog_weekly");
    }

    private BosslogWeeklyDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public BosslogWeeklyDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new BosslogWeeklyDOTableDef("", "bosslog_weekly", alias));
    }

}
