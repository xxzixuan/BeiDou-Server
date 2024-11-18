package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class FamilyCharacterDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final FamilyCharacterDOTableDef FAMILY_CHARACTER_D_O = new FamilyCharacterDOTableDef();

    public final QueryColumn CID = new QueryColumn(this, "cid");

    public final QueryColumn FAMILYID = new QueryColumn(this, "familyid");

    public final QueryColumn PRECEPTS = new QueryColumn(this, "precepts");

    public final QueryColumn SENIORID = new QueryColumn(this, "seniorid");

    public final QueryColumn TODAYSREP = new QueryColumn(this, "todaysrep");

    public final QueryColumn REPUTATION = new QueryColumn(this, "reputation");

    public final QueryColumn REPTOSENIOR = new QueryColumn(this, "reptosenior");

    public final QueryColumn LASTRESETTIME = new QueryColumn(this, "lastresettime");

    public final QueryColumn TOTALREPUTATION = new QueryColumn(this, "totalreputation");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{CID, FAMILYID, PRECEPTS, SENIORID, TODAYSREP, REPUTATION, REPTOSENIOR, LASTRESETTIME, TOTALREPUTATION};

    public FamilyCharacterDOTableDef() {
        super("", "family_character");
    }

    private FamilyCharacterDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public FamilyCharacterDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new FamilyCharacterDOTableDef("", "family_character", alias));
    }

}
