package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class PetsDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final PetsDOTableDef PETS_D_O = new PetsDOTableDef();

    public final QueryColumn FLAG = new QueryColumn(this, "flag");

    public final QueryColumn NAME = new QueryColumn(this, "name");

    public final QueryColumn LEVEL = new QueryColumn(this, "level");

    public final QueryColumn PETID = new QueryColumn(this, "petid");

    public final QueryColumn FULLNESS = new QueryColumn(this, "fullness");

    public final QueryColumn SUMMONED = new QueryColumn(this, "summoned");

    public final QueryColumn CLOSENESS = new QueryColumn(this, "closeness");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{FLAG, NAME, LEVEL, PETID, FULLNESS, SUMMONED, CLOSENESS};

    public PetsDOTableDef() {
        super("", "pets");
    }

    private PetsDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public PetsDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new PetsDOTableDef("", "pets", alias));
    }

}
