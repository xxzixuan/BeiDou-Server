package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class ShopsDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final ShopsDOTableDef SHOPS_D_O = new ShopsDOTableDef();

    public final QueryColumn NPCID = new QueryColumn(this, "npcid");

    public final QueryColumn SHOPID = new QueryColumn(this, "shopid");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{NPCID, SHOPID};

    public ShopsDOTableDef() {
        super("", "shops");
    }

    private ShopsDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public ShopsDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new ShopsDOTableDef("", "shops", alias));
    }

}
