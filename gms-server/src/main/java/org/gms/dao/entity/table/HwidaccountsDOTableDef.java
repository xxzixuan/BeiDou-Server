package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class HwidaccountsDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final HwidaccountsDOTableDef HWIDACCOUNTS_D_O = new HwidaccountsDOTableDef();

    public final QueryColumn HWID = new QueryColumn(this, "hwid");

    public final QueryColumn ACCOUNTID = new QueryColumn(this, "accountid");

    public final QueryColumn EXPIRESAT = new QueryColumn(this, "expiresat");

    public final QueryColumn RELEVANCE = new QueryColumn(this, "relevance");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{HWID, ACCOUNTID, EXPIRESAT, RELEVANCE};

    public HwidaccountsDOTableDef() {
        super("", "hwidaccounts");
    }

    private HwidaccountsDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public HwidaccountsDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new HwidaccountsDOTableDef("", "hwidaccounts", alias));
    }

}
