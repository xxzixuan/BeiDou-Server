package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class NotesDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final NotesDOTableDef NOTES_D_O = new NotesDOTableDef();

    public final QueryColumn ID = new QueryColumn(this, "id");

    public final QueryColumn TO = new QueryColumn(this, "to");

    public final QueryColumn FAME = new QueryColumn(this, "fame");

    public final QueryColumn FROM = new QueryColumn(this, "from");

    public final QueryColumn DELETED = new QueryColumn(this, "deleted");

    public final QueryColumn MESSAGE = new QueryColumn(this, "message");

    public final QueryColumn TIMESTAMP = new QueryColumn(this, "timestamp");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, TO, FAME, FROM, DELETED, MESSAGE, TIMESTAMP};

    public NotesDOTableDef() {
        super("", "notes");
    }

    private NotesDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public NotesDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new NotesDOTableDef("", "notes", alias));
    }

}
