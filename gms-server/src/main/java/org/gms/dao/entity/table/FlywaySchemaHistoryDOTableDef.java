package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class FlywaySchemaHistoryDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final FlywaySchemaHistoryDOTableDef FLYWAY_SCHEMA_HISTORY_D_O = new FlywaySchemaHistoryDOTableDef();

    public final QueryColumn TYPE = new QueryColumn(this, "type");

    public final QueryColumn SCRIPT = new QueryColumn(this, "script");

    public final QueryColumn SUCCESS = new QueryColumn(this, "success");

    public final QueryColumn VERSION = new QueryColumn(this, "version");

    public final QueryColumn CHECKSUM = new QueryColumn(this, "checksum");

    public final QueryColumn DESCRIPTION = new QueryColumn(this, "description");

    public final QueryColumn INSTALLED_BY = new QueryColumn(this, "installed_by");

    public final QueryColumn INSTALLED_ON = new QueryColumn(this, "installed_on");

    public final QueryColumn EXECUTION_TIME = new QueryColumn(this, "execution_time");

    public final QueryColumn INSTALLED_RANK = new QueryColumn(this, "installed_rank");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{TYPE, SCRIPT, SUCCESS, VERSION, CHECKSUM, DESCRIPTION, INSTALLED_BY, INSTALLED_ON, EXECUTION_TIME, INSTALLED_RANK};

    public FlywaySchemaHistoryDOTableDef() {
        super("", "flyway_schema_history");
    }

    private FlywaySchemaHistoryDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public FlywaySchemaHistoryDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new FlywaySchemaHistoryDOTableDef("", "flyway_schema_history", alias));
    }

}
