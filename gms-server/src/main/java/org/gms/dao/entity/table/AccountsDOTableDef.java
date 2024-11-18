package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class AccountsDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final AccountsDOTableDef ACCOUNTS_D_O = new AccountsDOTableDef();

    public final QueryColumn ID = new QueryColumn(this, "id");

    public final QueryColumn IP = new QueryColumn(this, "ip");

    public final QueryColumn PIC = new QueryColumn(this, "pic");

    public final QueryColumn PIN = new QueryColumn(this, "pin");

    public final QueryColumn TOS = new QueryColumn(this, "tos");

    public final QueryColumn HWID = new QueryColumn(this, "hwid");

    public final QueryColumn MACS = new QueryColumn(this, "macs");

    public final QueryColumn MUTE = new QueryColumn(this, "mute");

    public final QueryColumn NAME = new QueryColumn(this, "name");

    public final QueryColumn NICK = new QueryColumn(this, "nick");

    public final QueryColumn EMAIL = new QueryColumn(this, "email");

    public final QueryColumn BANNED = new QueryColumn(this, "banned");

    public final QueryColumn GENDER = new QueryColumn(this, "gender");

    public final QueryColumn GREASON = new QueryColumn(this, "greason");

    public final QueryColumn TEMPBAN = new QueryColumn(this, "tempban");

    public final QueryColumn BIRTHDAY = new QueryColumn(this, "birthday");

    public final QueryColumn LANGUAGE = new QueryColumn(this, "language");

    public final QueryColumn LOGGEDIN = new QueryColumn(this, "loggedin");

    public final QueryColumn NX_CREDIT = new QueryColumn(this, "nxCredit");

    public final QueryColumn PASSWORD = new QueryColumn(this, "password");

    public final QueryColumn WEBADMIN = new QueryColumn(this, "webadmin");

    public final QueryColumn BANREASON = new QueryColumn(this, "banreason");

    public final QueryColumn CREATEDAT = new QueryColumn(this, "createdat");

    public final QueryColumn LASTLOGIN = new QueryColumn(this, "lastlogin");

    public final QueryColumn NX_PREPAID = new QueryColumn(this, "nxPrepaid");

    public final QueryColumn MAPLE_POINT = new QueryColumn(this, "maplePoint");

    public final QueryColumn SITELOGGED = new QueryColumn(this, "sitelogged");

    public final QueryColumn VOTEPOINTS = new QueryColumn(this, "votepoints");

    public final QueryColumn REWARDPOINTS = new QueryColumn(this, "rewardpoints");

    public final QueryColumn CHARACTERSLOTS = new QueryColumn(this, "characterslots");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, IP, PIC, PIN, TOS, HWID, MACS, MUTE, NAME, NICK, EMAIL, BANNED, GENDER, GREASON, TEMPBAN, BIRTHDAY, LANGUAGE, LOGGEDIN, NX_CREDIT, PASSWORD, WEBADMIN, BANREASON, CREATEDAT, LASTLOGIN, NX_PREPAID, MAPLE_POINT, SITELOGGED, VOTEPOINTS, REWARDPOINTS, CHARACTERSLOTS};

    public AccountsDOTableDef() {
        super("", "accounts");
    }

    private AccountsDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public AccountsDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new AccountsDOTableDef("", "accounts", alias));
    }

}
