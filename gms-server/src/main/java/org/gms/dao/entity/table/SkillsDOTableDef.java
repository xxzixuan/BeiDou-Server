package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class SkillsDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final SkillsDOTableDef SKILLS_D_O = new SkillsDOTableDef();

    public final QueryColumn ID = new QueryColumn(this, "id");

    public final QueryColumn SKILLID = new QueryColumn(this, "skillid");

    public final QueryColumn EXPIRATION = new QueryColumn(this, "expiration");

    public final QueryColumn SKILLLEVEL = new QueryColumn(this, "skilllevel");

    public final QueryColumn CHARACTERID = new QueryColumn(this, "characterid");

    public final QueryColumn MASTERLEVEL = new QueryColumn(this, "masterlevel");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, SKILLID, EXPIRATION, SKILLLEVEL, CHARACTERID, MASTERLEVEL};

    public SkillsDOTableDef() {
        super("", "skills");
    }

    private SkillsDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public SkillsDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new SkillsDOTableDef("", "skills", alias));
    }

}
