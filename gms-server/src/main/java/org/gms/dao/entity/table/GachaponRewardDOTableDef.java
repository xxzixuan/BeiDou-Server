package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class GachaponRewardDOTableDef extends TableDef {

    /**
     * 实体类。

 @author lee
 @since 2024-09-19
     */
    public static final GachaponRewardDOTableDef GACHAPON_REWARD_D_O = new GachaponRewardDOTableDef();

    /**
     * 自增ID
     */
    public final QueryColumn ID = new QueryColumn(this, "id");

    /**
     * 道具ID
     */
    public final QueryColumn ITEM_ID = new QueryColumn(this, "item_id");

    /**
     * 绑定奖池ID
     */
    public final QueryColumn POOL_ID = new QueryColumn(this, "pool_id");

    /**
     * 备注
     */
    public final QueryColumn COMMENT = new QueryColumn(this, "comment");

    /**
     * 单次抽取数量
     */
    public final QueryColumn QUANTITY = new QueryColumn(this, "quantity");

    /**
     * 创建日期
     */
    public final QueryColumn CREATE_TIME = new QueryColumn(this, "create_time");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, ITEM_ID, POOL_ID, COMMENT, QUANTITY, CREATE_TIME};

    public GachaponRewardDOTableDef() {
        super("", "gachapon_reward");
    }

    private GachaponRewardDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public GachaponRewardDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new GachaponRewardDOTableDef("", "gachapon_reward", alias));
    }

}
