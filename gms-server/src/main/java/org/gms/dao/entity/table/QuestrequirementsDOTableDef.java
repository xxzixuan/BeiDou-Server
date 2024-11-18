package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class QuestrequirementsDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final QuestrequirementsDOTableDef QUESTREQUIREMENTS_D_O = new QuestrequirementsDOTableDef();

    public final QueryColumn DATA = new QueryColumn(this, "data");

    public final QueryColumn STATUS = new QueryColumn(this, "status");

    public final QueryColumn QUESTID = new QueryColumn(this, "questid");

    public final QueryColumn QUESTREQUIREMENTID = new QueryColumn(this, "questrequirementid");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{DATA, STATUS, QUESTID, QUESTREQUIREMENTID};

    public QuestrequirementsDOTableDef() {
        super("", "questrequirements");
    }

    private QuestrequirementsDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public QuestrequirementsDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new QuestrequirementsDOTableDef("", "questrequirements", alias));
    }

}
