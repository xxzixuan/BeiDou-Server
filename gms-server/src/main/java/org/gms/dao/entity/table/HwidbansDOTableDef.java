package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class HwidbansDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final HwidbansDOTableDef HWIDBANS_D_O = new HwidbansDOTableDef();

    public final QueryColumn HWID = new QueryColumn(this, "hwid");

    public final QueryColumn HWIDBANID = new QueryColumn(this, "hwidbanid");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{HWID, HWIDBANID};

    public HwidbansDOTableDef() {
        super("", "hwidbans");
    }

    private HwidbansDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public HwidbansDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new HwidbansDOTableDef("", "hwidbans", alias));
    }

}
