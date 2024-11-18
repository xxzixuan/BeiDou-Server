package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class KeymapDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final KeymapDOTableDef KEYMAP_D_O = new KeymapDOTableDef();

    public final QueryColumn ID = new QueryColumn(this, "id");

    public final QueryColumn KEY = new QueryColumn(this, "key");

    public final QueryColumn TYPE = new QueryColumn(this, "type");

    public final QueryColumn ACTION = new QueryColumn(this, "action");

    public final QueryColumn CHARACTERID = new QueryColumn(this, "characterid");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, KEY, TYPE, ACTION, CHARACTERID};

    public KeymapDOTableDef() {
        super("", "keymap");
    }

    private KeymapDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public KeymapDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new KeymapDOTableDef("", "keymap", alias));
    }

}
