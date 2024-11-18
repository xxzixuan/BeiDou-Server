package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class ExtendValueDOTableDef extends TableDef {

    /**
     * 扩展字段表 实体类。

 @author CN
 @since 2024-07-08
     */
    public static final ExtendValueDOTableDef EXTEND_VALUE_D_O = new ExtendValueDOTableDef();

    /**
     * 扩展字段id
     */
    public final QueryColumn EXTEND_ID = new QueryColumn(this, "extend_id");

    /**
     * 创建时间
     */
    public final QueryColumn CREATE_TIME = new QueryColumn(this, "create_time");

    /**
     * 扩展字段名称
     */
    public final QueryColumn EXTEND_NAME = new QueryColumn(this, "extend_name");

    /**
     * 扩展字段类型，11-账号，12-账号日清，13-账号周清；21-角色，22-角色日清，23-角色周清
     */
    public final QueryColumn EXTEND_TYPE = new QueryColumn(this, "extend_type");

    /**
     * 更新时间
     */
    public final QueryColumn UPDATE_TIME = new QueryColumn(this, "update_time");

    /**
     * 扩展字段值
     */
    public final QueryColumn EXTEND_VALUE = new QueryColumn(this, "extend_value");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{EXTEND_ID, CREATE_TIME, EXTEND_NAME, EXTEND_TYPE, UPDATE_TIME, EXTEND_VALUE};

    public ExtendValueDOTableDef() {
        super("", "extend_value");
    }

    private ExtendValueDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public ExtendValueDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new ExtendValueDOTableDef("", "extend_value", alias));
    }

}
