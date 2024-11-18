package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class GameConfigDOTableDef extends TableDef {

    /**
     * 游戏参数表 实体类。

 @author CN
 @since 2024-10-18
     */
    public static final GameConfigDOTableDef GAME_CONFIG_D_O = new GameConfigDOTableDef();

    /**
     * 自增id
     */
    public final QueryColumn ID = new QueryColumn(this, "id");

    /**
     * 参数名
     */
    public final QueryColumn CONFIG_CODE = new QueryColumn(this, "config_code");

    /**
     * 参数描述
     */
    public final QueryColumn CONFIG_DESC = new QueryColumn(this, "config_desc");

    /**
     * 参数类型
     */
    public final QueryColumn CONFIG_TYPE = new QueryColumn(this, "config_type");

    /**
     * 参数值java类型
     */
    public final QueryColumn CONFIG_CLAZZ = new QueryColumn(this, "config_clazz");

    /**
     * 参数值
     */
    public final QueryColumn CONFIG_VALUE = new QueryColumn(this, "config_value");

    /**
     * 参数子类型
     */
    public final QueryColumn CONFIG_SUB_TYPE = new QueryColumn(this, "config_sub_type");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, CONFIG_CODE, CONFIG_DESC, CONFIG_TYPE, CONFIG_CLAZZ, CONFIG_VALUE, CONFIG_SUB_TYPE};

    public GameConfigDOTableDef() {
        super("", "game_config");
    }

    private GameConfigDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public GameConfigDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new GameConfigDOTableDef("", "game_config", alias));
    }

}
