package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class HpMpAlertDOTableDef extends TableDef {

    /**
     * 实体类。

 @author lee
 @since 2024-09-06
     */
    public static final HpMpAlertDOTableDef HP_MP_ALERT_D_O = new HpMpAlertDOTableDef();

    public final QueryColumn HP = new QueryColumn(this, "hp");

    public final QueryColumn ID = new QueryColumn(this, "id");

    public final QueryColumn MP = new QueryColumn(this, "mp");

    public final QueryColumn C_ID = new QueryColumn(this, "c_id");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{HP, ID, MP, C_ID};

    public HpMpAlertDOTableDef() {
        super("", "hp_mp_alert");
    }

    private HpMpAlertDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public HpMpAlertDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new HpMpAlertDOTableDef("", "hp_mp_alert", alias));
    }

}
