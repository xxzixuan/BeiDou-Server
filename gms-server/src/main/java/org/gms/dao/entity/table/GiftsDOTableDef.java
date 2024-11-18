package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class GiftsDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final GiftsDOTableDef GIFTS_D_O = new GiftsDOTableDef();

    public final QueryColumn ID = new QueryColumn(this, "id");

    public final QueryColumn SN = new QueryColumn(this, "sn");

    public final QueryColumn TO = new QueryColumn(this, "to");

    public final QueryColumn FROM = new QueryColumn(this, "from");

    public final QueryColumn RINGID = new QueryColumn(this, "ringid");

    public final QueryColumn MESSAGE = new QueryColumn(this, "message");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, SN, TO, FROM, RINGID, MESSAGE};

    public GiftsDOTableDef() {
        super("", "gifts");
    }

    private GiftsDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public GiftsDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new GiftsDOTableDef("", "gifts", alias));
    }

}
