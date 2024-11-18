package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class AllianceguildsDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final AllianceguildsDOTableDef ALLIANCEGUILDS_D_O = new AllianceguildsDOTableDef();

    public final QueryColumn ID = new QueryColumn(this, "id");

    public final QueryColumn GUILDID = new QueryColumn(this, "guildid");

    public final QueryColumn ALLIANCEID = new QueryColumn(this, "allianceid");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, GUILDID, ALLIANCEID};

    public AllianceguildsDOTableDef() {
        super("", "allianceguilds");
    }

    private AllianceguildsDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public AllianceguildsDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new AllianceguildsDOTableDef("", "allianceguilds", alias));
    }

}
