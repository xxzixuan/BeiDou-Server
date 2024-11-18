package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class MacbansDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final MacbansDOTableDef MACBANS_D_O = new MacbansDOTableDef();

    public final QueryColumn AID = new QueryColumn(this, "aid");

    public final QueryColumn MAC = new QueryColumn(this, "mac");

    public final QueryColumn MACBANID = new QueryColumn(this, "macbanid");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{AID, MAC, MACBANID};

    public MacbansDOTableDef() {
        super("", "macbans");
    }

    private MacbansDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public MacbansDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new MacbansDOTableDef("", "macbans", alias));
    }

}
