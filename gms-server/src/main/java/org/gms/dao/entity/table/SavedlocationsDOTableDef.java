package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class SavedlocationsDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final SavedlocationsDOTableDef SAVEDLOCATIONS_D_O = new SavedlocationsDOTableDef();

    public final QueryColumn ID = new QueryColumn(this, "id");

    public final QueryColumn MAP = new QueryColumn(this, "map");

    public final QueryColumn PORTAL = new QueryColumn(this, "portal");

    public final QueryColumn CHARACTERID = new QueryColumn(this, "characterid");

    public final QueryColumn LOCATIONTYPE = new QueryColumn(this, "locationtype");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, MAP, PORTAL, CHARACTERID, LOCATIONTYPE};

    public SavedlocationsDOTableDef() {
        super("", "savedlocations");
    }

    private SavedlocationsDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public SavedlocationsDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new SavedlocationsDOTableDef("", "savedlocations", alias));
    }

}
