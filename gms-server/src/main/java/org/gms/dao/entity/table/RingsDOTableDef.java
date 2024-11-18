package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class RingsDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final RingsDOTableDef RINGS_D_O = new RingsDOTableDef();

    public final QueryColumn ID = new QueryColumn(this, "id");

    public final QueryColumn ITEMID = new QueryColumn(this, "itemid");

    public final QueryColumn PARTNERNAME = new QueryColumn(this, "partnername");

    public final QueryColumn PARTNER_CHR_ID = new QueryColumn(this, "partnerChrId");

    public final QueryColumn PARTNER_RING_ID = new QueryColumn(this, "partnerRingId");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, ITEMID, PARTNERNAME, PARTNER_CHR_ID, PARTNER_RING_ID};

    public RingsDOTableDef() {
        super("", "rings");
    }

    private RingsDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public RingsDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new RingsDOTableDef("", "rings", alias));
    }

}
