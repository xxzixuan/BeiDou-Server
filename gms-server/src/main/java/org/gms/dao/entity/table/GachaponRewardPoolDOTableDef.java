package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class GachaponRewardPoolDOTableDef extends TableDef {

    /**
     * 实体类。

 @author lee
 @since 2024-09-19
     */
    public static final GachaponRewardPoolDOTableDef GACHAPON_REWARD_POOL_D_O = new GachaponRewardPoolDOTableDef();

    /**
     * 自增ID
     */
    public final QueryColumn ID = new QueryColumn(this, "id");

    /**
     * 转蛋机奖池名称
     */
    public final QueryColumn NAME = new QueryColumn(this, "name");

    /**
     * 概率
     */
    public final QueryColumn PROB = new QueryColumn(this, "prob");

    /**
     * 权重
     */
    public final QueryColumn WEIGHT = new QueryColumn(this, "weight");

    /**
     * 备注
     */
    public final QueryColumn COMMENT = new QueryColumn(this, "comment");

    /**
     * 奖池的结束日期
     */
    public final QueryColumn END_TIME = new QueryColumn(this, "end_time");

    /**
     * 是否公共奖池 0为否 1为是
     */
    public final QueryColumn IS_PUBLIC = new QueryColumn(this, "is_public");

    /**
     * 奖池的启用日期
     */
    public final QueryColumn START_TIME = new QueryColumn(this, "start_time");

    /**
     * 绑定转蛋机ID
     */
    public final QueryColumn GACHAPON_ID = new QueryColumn(this, "gachapon_id");

    /**
     * 是否喇叭通知 0为否 1为是
     */
    public final QueryColumn NOTIFICATION = new QueryColumn(this, "notification");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, NAME, PROB, WEIGHT, COMMENT, END_TIME, IS_PUBLIC, START_TIME, GACHAPON_ID, NOTIFICATION};

    public GachaponRewardPoolDOTableDef() {
        super("", "gachapon_reward_pool");
    }

    private GachaponRewardPoolDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public GachaponRewardPoolDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new GachaponRewardPoolDOTableDef("", "gachapon_reward_pool", alias));
    }

}
