package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class DueyitemsDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final DueyitemsDOTableDef DUEYITEMS_D_O = new DueyitemsDOTableDef();

    public final QueryColumn ID = new QueryColumn(this, "id");

    public final QueryColumn PACKAGEID = new QueryColumn(this, "packageid");

    public final QueryColumn INVENTORYITEMID = new QueryColumn(this, "inventoryitemid");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, PACKAGEID, INVENTORYITEMID};

    public DueyitemsDOTableDef() {
        super("", "dueyitems");
    }

    private DueyitemsDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public DueyitemsDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new DueyitemsDOTableDef("", "dueyitems", alias));
    }

}
