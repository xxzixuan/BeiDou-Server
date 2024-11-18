package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class PlayernpcsFieldDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final PlayernpcsFieldDOTableDef PLAYERNPCS_FIELD_D_O = new PlayernpcsFieldDOTableDef();

    public final QueryColumn ID = new QueryColumn(this, "id");

    public final QueryColumn MAP = new QueryColumn(this, "map");

    public final QueryColumn STEP = new QueryColumn(this, "step");

    public final QueryColumn WORLD = new QueryColumn(this, "world");

    public final QueryColumn PODIUM = new QueryColumn(this, "podium");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, MAP, STEP, WORLD, PODIUM};

    public PlayernpcsFieldDOTableDef() {
        super("", "playernpcs_field");
    }

    private PlayernpcsFieldDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public PlayernpcsFieldDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new PlayernpcsFieldDOTableDef("", "playernpcs_field", alias));
    }

}
