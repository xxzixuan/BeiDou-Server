package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class LangResourcesDOTableDef extends TableDef {

    /**
     * 数据库i18n表 实体类。

 @author CN
 @since 2024-11-22
     */
    public static final LangResourcesDOTableDef LANG_RESOURCES_D_O = new LangResourcesDOTableDef();

    /**
     * 自增id
     */
    public final QueryColumn ID = new QueryColumn(this, "id");

    /**
     * 预留，当存在2个一样的code，不一样的value，需要用base来区分
     */
    public final QueryColumn LANG_BASE = new QueryColumn(this, "lang_base");

    /**
     * i18n编码
     */
    public final QueryColumn LANG_CODE = new QueryColumn(this, "lang_code");

    /**
     * 语言类型，zh-CN，en-US
     */
    public final QueryColumn LANG_TYPE = new QueryColumn(this, "lang_type");

    /**
     * i18n值
     */
    public final QueryColumn LANG_VALUE = new QueryColumn(this, "lang_value");

    /**
     * 预留扩展字段
     */
    public final QueryColumn LANG_EXTEND = new QueryColumn(this, "lang_extend");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, LANG_BASE, LANG_CODE, LANG_TYPE, LANG_VALUE, LANG_EXTEND};

    public LangResourcesDOTableDef() {
        super("", "lang_resources");
    }

    private LangResourcesDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public LangResourcesDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new LangResourcesDOTableDef("", "lang_resources", alias));
    }

}
