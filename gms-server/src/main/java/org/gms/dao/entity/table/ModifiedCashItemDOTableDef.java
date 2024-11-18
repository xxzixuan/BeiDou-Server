package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class ModifiedCashItemDOTableDef extends TableDef {

    /**
     * 商城物品修改表 实体类。

 @author CN
 @since 2024-08-08
     */
    public static final ModifiedCashItemDOTableDef MODIFIED_CASH_ITEM_D_O = new ModifiedCashItemDOTableDef();

    /**
     * sn码
     */
    public final QueryColumn SN = new QueryColumn(this, "sn");

    public final QueryColumn CLZ = new QueryColumn(this, "class");

    /**
     * 金币
     */
    public final QueryColumn MESO = new QueryColumn(this, "meso");

    /**
     * 属性奖励
     */
    public final QueryColumn BONUS = new QueryColumn(this, "bonus");

    /**
     * 数量
     */
    public final QueryColumn COUNT = new QueryColumn(this, "count");

    public final QueryColumn LIMIT = new QueryColumn(this, "limit");

    /**
     * 价格
     */
    public final QueryColumn PRICE = new QueryColumn(this, "price");

    /**
     * 物品id
     */
    public final QueryColumn ITEM_ID = new QueryColumn(this, "item_id");

    /**
     * 是否销售
     */
    public final QueryColumn ON_SALE = new QueryColumn(this, "on_sale");

    public final QueryColumn PB_CASH = new QueryColumn(this, "pb_cash");

    public final QueryColumn PB_GIFT = new QueryColumn(this, "pb_gift");

    /**
     * 有效期
     */
    public final QueryColumn PERIOD = new QueryColumn(this, "period");

    public final QueryColumn PB_POINT = new QueryColumn(this, "pb_point");

    /**
     * 优先级
     */
    public final QueryColumn PRIORITY = new QueryColumn(this, "priority");

    /**
     * 礼包SN
     */
    public final QueryColumn PACKAGE_SN = new QueryColumn(this, "package_sn");

    /**
     * 抵用券
     */
    public final QueryColumn MAPLE_POINT = new QueryColumn(this, "maple_point");

    /**
     * 高级用户
     */
    public final QueryColumn FOR_PREMIUM_USER = new QueryColumn(this, "for_premium_user");

    /**
     * 性别
     */
    public final QueryColumn COMMODITY_GENDER = new QueryColumn(this, "commodity_gender");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{SN, CLZ, MESO, BONUS, COUNT, LIMIT, PRICE, ITEM_ID, ON_SALE, PB_CASH, PB_GIFT, PERIOD, PB_POINT, PRIORITY, PACKAGE_SN, MAPLE_POINT, FOR_PREMIUM_USER, COMMODITY_GENDER};

    public ModifiedCashItemDOTableDef() {
        super("", "modified_cash_item");
    }

    private ModifiedCashItemDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public ModifiedCashItemDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new ModifiedCashItemDOTableDef("", "modified_cash_item", alias));
    }

}
