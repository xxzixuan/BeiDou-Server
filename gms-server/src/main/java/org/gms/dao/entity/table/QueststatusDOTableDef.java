package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class QueststatusDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final QueststatusDOTableDef QUESTSTATUS_D_O = new QueststatusDOTableDef();

    public final QueryColumn INFO = new QueryColumn(this, "info");

    public final QueryColumn TIME = new QueryColumn(this, "time");

    public final QueryColumn QUEST = new QueryColumn(this, "quest");

    public final QueryColumn STATUS = new QueryColumn(this, "status");

    public final QueryColumn EXPIRES = new QueryColumn(this, "expires");

    public final QueryColumn COMPLETED = new QueryColumn(this, "completed");

    public final QueryColumn FORFEITED = new QueryColumn(this, "forfeited");

    public final QueryColumn CHARACTERID = new QueryColumn(this, "characterid");

    public final QueryColumn QUESTSTATUSID = new QueryColumn(this, "queststatusid");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{INFO, TIME, QUEST, STATUS, EXPIRES, COMPLETED, FORFEITED, CHARACTERID, QUESTSTATUSID};

    public QueststatusDOTableDef() {
        super("", "queststatus");
    }

    private QueststatusDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public QueststatusDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new QueststatusDOTableDef("", "queststatus", alias));
    }

}
