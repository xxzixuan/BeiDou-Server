package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class AllianceDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final AllianceDOTableDef ALLIANCE_D_O = new AllianceDOTableDef();

    public final QueryColumn ID = new QueryColumn(this, "id");

    public final QueryColumn NAME = new QueryColumn(this, "name");

    public final QueryColumn RANK1 = new QueryColumn(this, "rank1");

    public final QueryColumn RANK2 = new QueryColumn(this, "rank2");

    public final QueryColumn RANK3 = new QueryColumn(this, "rank3");

    public final QueryColumn RANK4 = new QueryColumn(this, "rank4");

    public final QueryColumn RANK5 = new QueryColumn(this, "rank5");

    public final QueryColumn NOTICE = new QueryColumn(this, "notice");

    public final QueryColumn CAPACITY = new QueryColumn(this, "capacity");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, NAME, RANK1, RANK2, RANK3, RANK4, RANK5, NOTICE, CAPACITY};

    public AllianceDOTableDef() {
        super("", "alliance");
    }

    private AllianceDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public AllianceDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new AllianceDOTableDef("", "alliance", alias));
    }

}
