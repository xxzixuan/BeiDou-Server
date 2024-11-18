package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class IpbansDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final IpbansDOTableDef IPBANS_D_O = new IpbansDOTableDef();

    public final QueryColumn IP = new QueryColumn(this, "ip");

    public final QueryColumn AID = new QueryColumn(this, "aid");

    public final QueryColumn IPBANID = new QueryColumn(this, "ipbanid");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{IP, AID, IPBANID};

    public IpbansDOTableDef() {
        super("", "ipbans");
    }

    private IpbansDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public IpbansDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new IpbansDOTableDef("", "ipbans", alias));
    }

}
