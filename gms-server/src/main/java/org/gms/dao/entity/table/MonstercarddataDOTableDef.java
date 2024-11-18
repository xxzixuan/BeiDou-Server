package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class MonstercarddataDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final MonstercarddataDOTableDef MONSTERCARDDATA_D_O = new MonstercarddataDOTableDef();

    public final QueryColumn ID = new QueryColumn(this, "id");

    public final QueryColumn MOBID = new QueryColumn(this, "mobid");

    public final QueryColumn CARDID = new QueryColumn(this, "cardid");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, MOBID, CARDID};

    public MonstercarddataDOTableDef() {
        super("", "monstercarddata");
    }

    private MonstercarddataDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public MonstercarddataDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new MonstercarddataDOTableDef("", "monstercarddata", alias));
    }

}
