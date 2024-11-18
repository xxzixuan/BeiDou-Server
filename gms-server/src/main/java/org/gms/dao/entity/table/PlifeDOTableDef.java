package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class PlifeDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final PlifeDOTableDef PLIFE_D_O = new PlifeDOTableDef();

    public final QueryColumn F = new QueryColumn(this, "f");

    public final QueryColumn X = new QueryColumn(this, "x");

    public final QueryColumn Y = new QueryColumn(this, "y");

    public final QueryColumn CY = new QueryColumn(this, "cy");

    public final QueryColumn FH = new QueryColumn(this, "fh");

    public final QueryColumn ID = new QueryColumn(this, "id");

    public final QueryColumn MAP = new QueryColumn(this, "map");

    public final QueryColumn RX0 = new QueryColumn(this, "rx0");

    public final QueryColumn RX1 = new QueryColumn(this, "rx1");

    public final QueryColumn HIDE = new QueryColumn(this, "hide");

    public final QueryColumn LIFE = new QueryColumn(this, "life");

    public final QueryColumn TEAM = new QueryColumn(this, "team");

    public final QueryColumn TYPE = new QueryColumn(this, "type");

    public final QueryColumn WORLD = new QueryColumn(this, "world");

    public final QueryColumn MOBTIME = new QueryColumn(this, "mobtime");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{F, X, Y, CY, FH, ID, MAP, RX0, RX1, HIDE, LIFE, TEAM, TYPE, WORLD, MOBTIME};

    public PlifeDOTableDef() {
        super("", "plife");
    }

    private PlifeDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public PlifeDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new PlifeDOTableDef("", "plife", alias));
    }

}
