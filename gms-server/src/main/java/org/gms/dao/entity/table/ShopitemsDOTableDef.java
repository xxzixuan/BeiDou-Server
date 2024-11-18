package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class ShopitemsDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final ShopitemsDOTableDef SHOPITEMS_D_O = new ShopitemsDOTableDef();

    public final QueryColumn PITCH = new QueryColumn(this, "pitch");

    public final QueryColumn PRICE = new QueryColumn(this, "price");

    public final QueryColumn ITEMID = new QueryColumn(this, "itemid");

    public final QueryColumn SHOPID = new QueryColumn(this, "shopid");

    /**
     * sort is an arbitrary field designed to give leeway when modifying shops. The lowest number is 104 and it increments by 4 for each item to allow decent space for swapping/inserting/removing items.
     */
    public final QueryColumn POSITION = new QueryColumn(this, "position");

    public final QueryColumn SHOPITEMID = new QueryColumn(this, "shopitemid");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{PITCH, PRICE, ITEMID, SHOPID, POSITION, SHOPITEMID};

    public ShopitemsDOTableDef() {
        super("", "shopitems");
    }

    private ShopitemsDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public ShopitemsDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new ShopitemsDOTableDef("", "shopitems", alias));
    }

}
