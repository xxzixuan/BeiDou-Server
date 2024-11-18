package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class CooldownsDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final CooldownsDOTableDef COOLDOWNS_D_O = new CooldownsDOTableDef();

    public final QueryColumn ID = new QueryColumn(this, "id");

    public final QueryColumn CHARID = new QueryColumn(this, "charid");

    public final QueryColumn LENGTH = new QueryColumn(this, "length");

    public final QueryColumn SKILLID = new QueryColumn(this, "skillid");

    public final QueryColumn STARTTIME = new QueryColumn(this, "starttime");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, CHARID, LENGTH, SKILLID, STARTTIME};

    public CooldownsDOTableDef() {
        super("", "cooldowns");
    }

    private CooldownsDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public CooldownsDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new CooldownsDOTableDef("", "cooldowns", alias));
    }

}
