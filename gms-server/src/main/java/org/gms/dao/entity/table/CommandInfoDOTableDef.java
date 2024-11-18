package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class CommandInfoDOTableDef extends TableDef {

    public static final CommandInfoDOTableDef COMMAND_INFO_D_O = new CommandInfoDOTableDef();

    public final QueryColumn ID = new QueryColumn(this, "id");

    public final QueryColumn CLAZZ = new QueryColumn(this, "clazz");

    public final QueryColumn LEVEL = new QueryColumn(this, "level");

    public final QueryColumn SYNTAX = new QueryColumn(this, "syntax");

    public final QueryColumn ENABLED = new QueryColumn(this, "enabled");

    public final QueryColumn DEFAULT_LEVEL = new QueryColumn(this, "default_level");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, CLAZZ, LEVEL, SYNTAX, ENABLED, DEFAULT_LEVEL};

    public CommandInfoDOTableDef() {
        super("", "command_info");
    }

    private CommandInfoDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public CommandInfoDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new CommandInfoDOTableDef("", "command_info", alias));
    }

}
