package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class SpecialcashitemsDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final SpecialcashitemsDOTableDef SPECIALCASHITEMS_D_O = new SpecialcashitemsDOTableDef();

    public final QueryColumn ID = new QueryColumn(this, "id");

    public final QueryColumn SN = new QueryColumn(this, "sn");

    public final QueryColumn INFO = new QueryColumn(this, "info");

    /**
     * 1024 is add/remove
     */
    public final QueryColumn MODIFIER = new QueryColumn(this, "modifier");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, SN, INFO, MODIFIER};

    public SpecialcashitemsDOTableDef() {
        super("", "specialcashitems");
    }

    private SpecialcashitemsDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public SpecialcashitemsDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new SpecialcashitemsDOTableDef("", "specialcashitems", alias));
    }

}
