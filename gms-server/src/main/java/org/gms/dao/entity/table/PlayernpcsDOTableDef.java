package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class PlayernpcsDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final PlayernpcsDOTableDef PLAYERNPCS_D_O = new PlayernpcsDOTableDef();

    public final QueryColumn X = new QueryColumn(this, "x");

    public final QueryColumn CY = new QueryColumn(this, "cy");

    public final QueryColumn FH = new QueryColumn(this, "fh");

    public final QueryColumn ID = new QueryColumn(this, "id");

    public final QueryColumn DIR = new QueryColumn(this, "dir");

    public final QueryColumn JOB = new QueryColumn(this, "job");

    public final QueryColumn MAP = new QueryColumn(this, "map");

    public final QueryColumn RX0 = new QueryColumn(this, "rx0");

    public final QueryColumn RX1 = new QueryColumn(this, "rx1");

    public final QueryColumn FACE = new QueryColumn(this, "face");

    public final QueryColumn HAIR = new QueryColumn(this, "hair");

    public final QueryColumn NAME = new QueryColumn(this, "name");

    public final QueryColumn SKIN = new QueryColumn(this, "skin");

    public final QueryColumn WORLD = new QueryColumn(this, "world");

    public final QueryColumn GENDER = new QueryColumn(this, "gender");

    public final QueryColumn SCRIPTID = new QueryColumn(this, "scriptid");

    public final QueryColumn WORLDRANK = new QueryColumn(this, "worldrank");

    public final QueryColumn OVERALLRANK = new QueryColumn(this, "overallrank");

    public final QueryColumn WORLDJOBRANK = new QueryColumn(this, "worldjobrank");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{X, CY, FH, ID, DIR, JOB, MAP, RX0, RX1, FACE, HAIR, NAME, SKIN, WORLD, GENDER, SCRIPTID, WORLDRANK, OVERALLRANK, WORLDJOBRANK};

    public PlayernpcsDOTableDef() {
        super("", "playernpcs");
    }

    private PlayernpcsDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public PlayernpcsDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new PlayernpcsDOTableDef("", "playernpcs", alias));
    }

}
