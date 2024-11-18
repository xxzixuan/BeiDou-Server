package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class MakerreagentdataDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final MakerreagentdataDOTableDef MAKERREAGENTDATA_D_O = new MakerreagentdataDOTableDef();

    public final QueryColumn STAT = new QueryColumn(this, "stat");

    public final QueryColumn VALUE = new QueryColumn(this, "value");

    public final QueryColumn ITEMID = new QueryColumn(this, "itemid");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{STAT, VALUE, ITEMID};

    public MakerreagentdataDOTableDef() {
        super("", "makerreagentdata");
    }

    private MakerreagentdataDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public MakerreagentdataDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new MakerreagentdataDOTableDef("", "makerreagentdata", alias));
    }

}
