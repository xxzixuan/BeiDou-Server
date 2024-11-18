package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class MakercreatedataDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final MakercreatedataDOTableDef MAKERCREATEDATA_D_O = new MakercreatedataDOTableDef();

    public final QueryColumn ID = new QueryColumn(this, "id");

    public final QueryColumn TUC = new QueryColumn(this, "tuc");

    public final QueryColumn ITEMID = new QueryColumn(this, "itemid");

    public final QueryColumn REQ_ITEM = new QueryColumn(this, "req_item");

    public final QueryColumn REQ_MESO = new QueryColumn(this, "req_meso");

    public final QueryColumn CATALYST = new QueryColumn(this, "catalyst");

    public final QueryColumn QUANTITY = new QueryColumn(this, "quantity");

    public final QueryColumn REQ_EQUIP = new QueryColumn(this, "req_equip");

    public final QueryColumn REQ_LEVEL = new QueryColumn(this, "req_level");

    public final QueryColumn REQ_MAKER_LEVEL = new QueryColumn(this, "req_maker_level");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, TUC, ITEMID, REQ_ITEM, REQ_MESO, CATALYST, QUANTITY, REQ_EQUIP, REQ_LEVEL, REQ_MAKER_LEVEL};

    public MakercreatedataDOTableDef() {
        super("", "makercreatedata");
    }

    private MakercreatedataDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public MakercreatedataDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new MakercreatedataDOTableDef("", "makercreatedata", alias));
    }

}
