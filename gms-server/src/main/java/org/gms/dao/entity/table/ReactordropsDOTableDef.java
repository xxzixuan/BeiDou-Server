package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class ReactordropsDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final ReactordropsDOTableDef REACTORDROPS_D_O = new ReactordropsDOTableDef();

    public final QueryColumn CHANCE = new QueryColumn(this, "chance");

    public final QueryColumn ITEMID = new QueryColumn(this, "itemid");

    public final QueryColumn QUESTID = new QueryColumn(this, "questid");

    public final QueryColumn REACTORID = new QueryColumn(this, "reactorid");

    public final QueryColumn REACTORDROPID = new QueryColumn(this, "reactordropid");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{CHANCE, ITEMID, QUESTID, REACTORID, REACTORDROPID};

    public ReactordropsDOTableDef() {
        super("", "reactordrops");
    }

    private ReactordropsDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public ReactordropsDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new ReactordropsDOTableDef("", "reactordrops", alias));
    }

}
