package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class MakerrecipedataDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final MakerrecipedataDOTableDef MAKERRECIPEDATA_D_O = new MakerrecipedataDOTableDef();

    public final QueryColumn COUNT = new QueryColumn(this, "count");

    public final QueryColumn ITEMID = new QueryColumn(this, "itemid");

    public final QueryColumn REQ_ITEM = new QueryColumn(this, "req_item");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{COUNT, ITEMID, REQ_ITEM};

    public MakerrecipedataDOTableDef() {
        super("", "makerrecipedata");
    }

    private MakerrecipedataDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public MakerrecipedataDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new MakerrecipedataDOTableDef("", "makerrecipedata", alias));
    }

}
