package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class BbsRepliesDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final BbsRepliesDOTableDef BBS_REPLIES_D_O = new BbsRepliesDOTableDef();

    public final QueryColumn CONTENT = new QueryColumn(this, "content");

    public final QueryColumn REPLYID = new QueryColumn(this, "replyid");

    public final QueryColumn THREADID = new QueryColumn(this, "threadid");

    public final QueryColumn POSTERCID = new QueryColumn(this, "postercid");

    public final QueryColumn TIMESTAMP = new QueryColumn(this, "timestamp");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{CONTENT, REPLYID, THREADID, POSTERCID, TIMESTAMP};

    public BbsRepliesDOTableDef() {
        super("", "bbs_replies");
    }

    private BbsRepliesDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public BbsRepliesDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new BbsRepliesDOTableDef("", "bbs_replies", alias));
    }

}
