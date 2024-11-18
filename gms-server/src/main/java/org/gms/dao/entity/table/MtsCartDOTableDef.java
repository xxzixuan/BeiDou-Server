package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class MtsCartDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final MtsCartDOTableDef MTS_CART_D_O = new MtsCartDOTableDef();

    public final QueryColumn ID = new QueryColumn(this, "id");

    public final QueryColumn CID = new QueryColumn(this, "cid");

    public final QueryColumn ITEMID = new QueryColumn(this, "itemid");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, CID, ITEMID};

    public MtsCartDOTableDef() {
        super("", "mts_cart");
    }

    private MtsCartDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public MtsCartDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new MtsCartDOTableDef("", "mts_cart", alias));
    }

}
