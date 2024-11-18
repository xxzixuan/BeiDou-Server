package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class AreaInfoDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final AreaInfoDOTableDef AREA_INFO_D_O = new AreaInfoDOTableDef();

    public final QueryColumn ID = new QueryColumn(this, "id");

    public final QueryColumn AREA = new QueryColumn(this, "area");

    public final QueryColumn INFO = new QueryColumn(this, "info");

    public final QueryColumn CHARID = new QueryColumn(this, "charid");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, AREA, INFO, CHARID};

    public AreaInfoDOTableDef() {
        super("", "area_info");
    }

    private AreaInfoDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public AreaInfoDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new AreaInfoDOTableDef("", "area_info", alias));
    }

}
