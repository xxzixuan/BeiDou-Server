package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class BbsThreadsDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final BbsThreadsDOTableDef BBS_THREADS_D_O = new BbsThreadsDOTableDef();

    public final QueryColumn ICON = new QueryColumn(this, "icon");

    public final QueryColumn NAME = new QueryColumn(this, "name");

    public final QueryColumn GUILDID = new QueryColumn(this, "guildid");

    public final QueryColumn THREADID = new QueryColumn(this, "threadid");

    public final QueryColumn POSTERCID = new QueryColumn(this, "postercid");

    public final QueryColumn STARTPOST = new QueryColumn(this, "startpost");

    public final QueryColumn TIMESTAMP = new QueryColumn(this, "timestamp");

    public final QueryColumn REPLYCOUNT = new QueryColumn(this, "replycount");

    public final QueryColumn LOCALTHREADID = new QueryColumn(this, "localthreadid");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ICON, NAME, GUILDID, THREADID, POSTERCID, STARTPOST, TIMESTAMP, REPLYCOUNT, LOCALTHREADID};

    public BbsThreadsDOTableDef() {
        super("", "bbs_threads");
    }

    private BbsThreadsDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public BbsThreadsDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new BbsThreadsDOTableDef("", "bbs_threads", alias));
    }

}
