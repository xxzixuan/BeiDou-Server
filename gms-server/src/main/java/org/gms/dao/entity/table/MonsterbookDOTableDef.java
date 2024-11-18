package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class MonsterbookDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final MonsterbookDOTableDef MONSTERBOOK_D_O = new MonsterbookDOTableDef();

    public final QueryColumn LEVEL = new QueryColumn(this, "level");

    public final QueryColumn CARDID = new QueryColumn(this, "cardid");

    public final QueryColumn CHARID = new QueryColumn(this, "charid");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{LEVEL, CARDID, CHARID};

    public MonsterbookDOTableDef() {
        super("", "monsterbook");
    }

    private MonsterbookDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public MonsterbookDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new MonsterbookDOTableDef("", "monsterbook", alias));
    }

}
