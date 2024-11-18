package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class SkillmacrosDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final SkillmacrosDOTableDef SKILLMACROS_D_O = new SkillmacrosDOTableDef();

    public final QueryColumn ID = new QueryColumn(this, "id");

    public final QueryColumn NAME = new QueryColumn(this, "name");

    public final QueryColumn SHOUT = new QueryColumn(this, "shout");

    public final QueryColumn SKILL1 = new QueryColumn(this, "skill1");

    public final QueryColumn SKILL2 = new QueryColumn(this, "skill2");

    public final QueryColumn SKILL3 = new QueryColumn(this, "skill3");

    public final QueryColumn POSITION = new QueryColumn(this, "position");

    public final QueryColumn CHARACTERID = new QueryColumn(this, "characterid");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, NAME, SHOUT, SKILL1, SKILL2, SKILL3, POSITION, CHARACTERID};

    public SkillmacrosDOTableDef() {
        super("", "skillmacros");
    }

    private SkillmacrosDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public SkillmacrosDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new SkillmacrosDOTableDef("", "skillmacros", alias));
    }

}
