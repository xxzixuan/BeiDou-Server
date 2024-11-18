package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class QuickslotkeymappedDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final QuickslotkeymappedDOTableDef QUICKSLOTKEYMAPPED_D_O = new QuickslotkeymappedDOTableDef();

    public final QueryColumn KEYMAP = new QueryColumn(this, "keymap");

    public final QueryColumn ACCOUNTID = new QueryColumn(this, "accountid");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{KEYMAP, ACCOUNTID};

    public QuickslotkeymappedDOTableDef() {
        super("", "quickslotkeymapped");
    }

    private QuickslotkeymappedDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public QuickslotkeymappedDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new QuickslotkeymappedDOTableDef("", "quickslotkeymapped", alias));
    }

}
