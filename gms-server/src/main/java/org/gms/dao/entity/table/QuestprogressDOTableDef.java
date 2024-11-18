package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class QuestprogressDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final QuestprogressDOTableDef QUESTPROGRESS_D_O = new QuestprogressDOTableDef();

    public final QueryColumn ID = new QueryColumn(this, "id");

    public final QueryColumn PROGRESS = new QueryColumn(this, "progress");

    public final QueryColumn PROGRESSID = new QueryColumn(this, "progressid");

    public final QueryColumn CHARACTERID = new QueryColumn(this, "characterid");

    public final QueryColumn QUESTSTATUSID = new QueryColumn(this, "queststatusid");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, PROGRESS, PROGRESSID, CHARACTERID, QUESTSTATUSID};

    public QuestprogressDOTableDef() {
        super("", "questprogress");
    }

    private QuestprogressDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public QuestprogressDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new QuestprogressDOTableDef("", "questprogress", alias));
    }

}
