package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class MakerrewarddataDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final MakerrewarddataDOTableDef MAKERREWARDDATA_D_O = new MakerrewarddataDOTableDef();

    public final QueryColumn PROB = new QueryColumn(this, "prob");

    public final QueryColumn ITEMID = new QueryColumn(this, "itemid");

    public final QueryColumn QUANTITY = new QueryColumn(this, "quantity");

    public final QueryColumn REWARDID = new QueryColumn(this, "rewardid");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{PROB, ITEMID, QUANTITY, REWARDID};

    public MakerrewarddataDOTableDef() {
        super("", "makerrewarddata");
    }

    private MakerrewarddataDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public MakerrewarddataDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new MakerrewarddataDOTableDef("", "makerrewarddata", alias));
    }

}
