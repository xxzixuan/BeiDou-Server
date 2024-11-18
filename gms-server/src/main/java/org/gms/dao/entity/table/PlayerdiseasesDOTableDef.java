package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class PlayerdiseasesDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final PlayerdiseasesDOTableDef PLAYERDISEASES_D_O = new PlayerdiseasesDOTableDef();

    public final QueryColumn ID = new QueryColumn(this, "id");

    public final QueryColumn CHARID = new QueryColumn(this, "charid");

    public final QueryColumn LENGTH = new QueryColumn(this, "length");

    public final QueryColumn DISEASE = new QueryColumn(this, "disease");

    public final QueryColumn MOBSKILLID = new QueryColumn(this, "mobskillid");

    public final QueryColumn MOBSKILLLV = new QueryColumn(this, "mobskilllv");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, CHARID, LENGTH, DISEASE, MOBSKILLID, MOBSKILLLV};

    public PlayerdiseasesDOTableDef() {
        super("", "playerdiseases");
    }

    private PlayerdiseasesDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public PlayerdiseasesDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new PlayerdiseasesDOTableDef("", "playerdiseases", alias));
    }

}
