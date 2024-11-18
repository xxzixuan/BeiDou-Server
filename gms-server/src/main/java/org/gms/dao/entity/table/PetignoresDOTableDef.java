package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class PetignoresDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final PetignoresDOTableDef PETIGNORES_D_O = new PetignoresDOTableDef();

    public final QueryColumn ID = new QueryColumn(this, "id");

    public final QueryColumn PETID = new QueryColumn(this, "petid");

    public final QueryColumn ITEMID = new QueryColumn(this, "itemid");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, PETID, ITEMID};

    public PetignoresDOTableDef() {
        super("", "petignores");
    }

    private PetignoresDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public PetignoresDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new PetignoresDOTableDef("", "petignores", alias));
    }

}
