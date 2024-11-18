package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class NxcouponsDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final NxcouponsDOTableDef NXCOUPONS_D_O = new NxcouponsDOTableDef();

    public final QueryColumn ID = new QueryColumn(this, "id");

    public final QueryColumn RATE = new QueryColumn(this, "rate");

    public final QueryColumn ENDHOUR = new QueryColumn(this, "endhour");

    public final QueryColumn COUPONID = new QueryColumn(this, "couponid");

    public final QueryColumn ACTIVEDAY = new QueryColumn(this, "activeday");

    public final QueryColumn STARTHOUR = new QueryColumn(this, "starthour");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, RATE, ENDHOUR, COUPONID, ACTIVEDAY, STARTHOUR};

    public NxcouponsDOTableDef() {
        super("", "nxcoupons");
    }

    private NxcouponsDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public NxcouponsDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new NxcouponsDOTableDef("", "nxcoupons", alias));
    }

}
