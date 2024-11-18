package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class FamilyEntitlementDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final FamilyEntitlementDOTableDef FAMILY_ENTITLEMENT_D_O = new FamilyEntitlementDOTableDef();

    public final QueryColumn ID = new QueryColumn(this, "id");

    public final QueryColumn CHARID = new QueryColumn(this, "charid");

    public final QueryColumn TIMESTAMP = new QueryColumn(this, "timestamp");

    public final QueryColumn ENTITLEMENTID = new QueryColumn(this, "entitlementid");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, CHARID, TIMESTAMP, ENTITLEMENTID};

    public FamilyEntitlementDOTableDef() {
        super("", "family_entitlement");
    }

    private FamilyEntitlementDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public FamilyEntitlementDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new FamilyEntitlementDOTableDef("", "family_entitlement", alias));
    }

}
