package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class GuildsDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final GuildsDOTableDef GUILDS_D_O = new GuildsDOTableDef();

    public final QueryColumn GP = new QueryColumn(this, "gp");

    public final QueryColumn LOGO = new QueryColumn(this, "logo");

    public final QueryColumn NAME = new QueryColumn(this, "name");

    public final QueryColumn LEADER = new QueryColumn(this, "leader");

    public final QueryColumn LOGO_B_G = new QueryColumn(this, "logoBG");

    public final QueryColumn NOTICE = new QueryColumn(this, "notice");

    public final QueryColumn GUILDID = new QueryColumn(this, "guildid");

    public final QueryColumn CAPACITY = new QueryColumn(this, "capacity");

    public final QueryColumn LOGO_COLOR = new QueryColumn(this, "logoColor");

    public final QueryColumn SIGNATURE = new QueryColumn(this, "signature");

    public final QueryColumn ALLIANCE_ID = new QueryColumn(this, "allianceId");

    public final QueryColumn RANK1TITLE = new QueryColumn(this, "rank1title");

    public final QueryColumn RANK2TITLE = new QueryColumn(this, "rank2title");

    public final QueryColumn RANK3TITLE = new QueryColumn(this, "rank3title");

    public final QueryColumn RANK4TITLE = new QueryColumn(this, "rank4title");

    public final QueryColumn RANK5TITLE = new QueryColumn(this, "rank5title");

    public final QueryColumn LOGO_B_G_COLOR = new QueryColumn(this, "logoBGColor");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{GP, LOGO, NAME, LEADER, LOGO_B_G, NOTICE, GUILDID, CAPACITY, LOGO_COLOR, SIGNATURE, ALLIANCE_ID, RANK1TITLE, RANK2TITLE, RANK3TITLE, RANK4TITLE, RANK5TITLE, LOGO_B_G_COLOR};

    public GuildsDOTableDef() {
        super("", "guilds");
    }

    private GuildsDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public GuildsDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new GuildsDOTableDef("", "guilds", alias));
    }

}
