package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class CharactersDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final CharactersDOTableDef CHARACTERS_D_O = new CharactersDOTableDef();

    public final QueryColumn AP = new QueryColumn(this, "ap");

    public final QueryColumn GM = new QueryColumn(this, "gm");

    public final QueryColumn HP = new QueryColumn(this, "hp");

    public final QueryColumn ID = new QueryColumn(this, "id");

    public final QueryColumn MP = new QueryColumn(this, "mp");

    public final QueryColumn SP = new QueryColumn(this, "sp");

    public final QueryColumn EXP = new QueryColumn(this, "exp");

    public final QueryColumn JOB = new QueryColumn(this, "job");

    public final QueryColumn MAP = new QueryColumn(this, "map");

    public final QueryColumn FACE = new QueryColumn(this, "face");

    public final QueryColumn FAME = new QueryColumn(this, "fame");

    public final QueryColumn HAIR = new QueryColumn(this, "hair");

    public final QueryColumn MESO = new QueryColumn(this, "meso");

    public final QueryColumn NAME = new QueryColumn(this, "name");

    public final QueryColumn RANK = new QueryColumn(this, "rank");

    public final QueryColumn LEVEL = new QueryColumn(this, "level");

    public final QueryColumn MAXHP = new QueryColumn(this, "maxhp");

    public final QueryColumn MAXMP = new QueryColumn(this, "maxmp");

    public final QueryColumn PARTY = new QueryColumn(this, "party");

    public final QueryColumn WORLD = new QueryColumn(this, "world");

    public final QueryColumn FQUEST = new QueryColumn(this, "fquest");

    public final QueryColumn GENDER = new QueryColumn(this, "gender");

    public final QueryColumn ATTR_DEX = new QueryColumn(this, "dex");

    public final QueryColumn ATTR_INT = new QueryColumn(this, "int");

    public final QueryColumn ATTR_LUK = new QueryColumn(this, "luk");

    public final QueryColumn ATTR_STR = new QueryColumn(this, "str");

    public final QueryColumn GUILDID = new QueryColumn(this, "guildid");

    public final QueryColumn JOB_RANK = new QueryColumn(this, "jobRank");

    public final QueryColumn REBORNS = new QueryColumn(this, "reborns");

    public final QueryColumn ETCSLOTS = new QueryColumn(this, "etcslots");

    public final QueryColumn FAMILY_ID = new QueryColumn(this, "familyId");

    public final QueryColumn GACHAEXP = new QueryColumn(this, "gachaexp");

    public final QueryColumn HP_MP_USED = new QueryColumn(this, "hpMpUsed");

    public final QueryColumn MOUNTEXP = new QueryColumn(this, "mountexp");

    public final QueryColumn OMOKTIES = new QueryColumn(this, "omokties");

    public final QueryColumn OMOKWINS = new QueryColumn(this, "omokwins");

    public final QueryColumn PQPOINTS = new QueryColumn(this, "pqpoints");

    public final QueryColumn RANK_MOVE = new QueryColumn(this, "rankMove");

    public final QueryColumn USESLOTS = new QueryColumn(this, "useslots");

    public final QueryColumn ACCOUNTID = new QueryColumn(this, "accountid");

    public final QueryColumn GUILDRANK = new QueryColumn(this, "guildrank");

    public final QueryColumn PARTNER_ID = new QueryColumn(this, "partnerId");

    public final QueryColumn SKINCOLOR = new QueryColumn(this, "skincolor");

    public final QueryColumn CREATEDATE = new QueryColumn(this, "createdate");

    public final QueryColumn DATA_STRING = new QueryColumn(this, "dataString");

    public final QueryColumn DOJO_POINTS = new QueryColumn(this, "dojoPoints");

    public final QueryColumn EQUIPSLOTS = new QueryColumn(this, "equipslots");

    public final QueryColumn JAILEXPIRE = new QueryColumn(this, "jailexpire");

    public final QueryColumn MOUNTLEVEL = new QueryColumn(this, "mountlevel");

    public final QueryColumn OMOKLOSSES = new QueryColumn(this, "omoklosses");

    public final QueryColumn SETUPSLOTS = new QueryColumn(this, "setupslots");

    public final QueryColumn SPAWNPOINT = new QueryColumn(this, "spawnpoint");

    public final QueryColumn HASMERCHANT = new QueryColumn(this, "hasmerchant");

    public final QueryColumn JOB_RANK_MOVE = new QueryColumn(this, "jobRankMove");

    public final QueryColumn MESSENGERID = new QueryColumn(this, "messengerid");

    public final QueryColumn PARTY_SEARCH = new QueryColumn(this, "partySearch");

    public final QueryColumn SUMMON_VALUE = new QueryColumn(this, "summonValue");

    public final QueryColumn ALLIANCE_RANK = new QueryColumn(this, "allianceRank");

    public final QueryColumn ARIANT_POINTS = new QueryColumn(this, "ariantPoints");

    public final QueryColumn BUDDY_CAPACITY = new QueryColumn(this, "buddyCapacity");

    public final QueryColumn LAST_DOJO_STAGE = new QueryColumn(this, "lastDojoStage");

    public final QueryColumn MATCHCARDTIES = new QueryColumn(this, "matchcardties");

    public final QueryColumn MATCHCARDWINS = new QueryColumn(this, "matchcardwins");

    public final QueryColumn MERCHANTMESOS = new QueryColumn(this, "merchantmesos");

    public final QueryColumn LAST_LOGOUT_TIME = new QueryColumn(this, "lastLogoutTime");

    public final QueryColumn MARRIAGE_ITEM_ID = new QueryColumn(this, "marriageItemId");

    public final QueryColumn MOUNTTIREDNESS = new QueryColumn(this, "mounttiredness");

    public final QueryColumn LAST_EXP_GAIN_TIME = new QueryColumn(this, "lastExpGainTime");

    public final QueryColumn MATCHCARDLOSSES = new QueryColumn(this, "matchcardlosses");

    public final QueryColumn VANQUISHER_KILLS = new QueryColumn(this, "vanquisherKills");

    public final QueryColumn VANQUISHER_STAGE = new QueryColumn(this, "vanquisherStage");

    public final QueryColumn MONSTERBOOKCOVER = new QueryColumn(this, "monsterbookcover");

    public final QueryColumn MESSENGERPOSITION = new QueryColumn(this, "messengerposition");

    public final QueryColumn FINISHED_DOJO_TUTORIAL = new QueryColumn(this, "finishedDojoTutorial");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{AP, GM, HP, ID, MP, SP, EXP, JOB, MAP, FACE, FAME, HAIR, MESO, NAME, RANK, LEVEL, MAXHP, MAXMP, PARTY, WORLD, FQUEST, GENDER, ATTR_DEX, ATTR_INT, ATTR_LUK, ATTR_STR, GUILDID, JOB_RANK, REBORNS, ETCSLOTS, FAMILY_ID, GACHAEXP, HP_MP_USED, MOUNTEXP, OMOKTIES, OMOKWINS, PQPOINTS, RANK_MOVE, USESLOTS, ACCOUNTID, GUILDRANK, PARTNER_ID, SKINCOLOR, CREATEDATE, DATA_STRING, DOJO_POINTS, EQUIPSLOTS, JAILEXPIRE, MOUNTLEVEL, OMOKLOSSES, SETUPSLOTS, SPAWNPOINT, HASMERCHANT, JOB_RANK_MOVE, MESSENGERID, PARTY_SEARCH, SUMMON_VALUE, ALLIANCE_RANK, ARIANT_POINTS, BUDDY_CAPACITY, LAST_DOJO_STAGE, MATCHCARDTIES, MATCHCARDWINS, MERCHANTMESOS, LAST_LOGOUT_TIME, MARRIAGE_ITEM_ID, MOUNTTIREDNESS, LAST_EXP_GAIN_TIME, MATCHCARDLOSSES, VANQUISHER_KILLS, VANQUISHER_STAGE, MONSTERBOOKCOVER, MESSENGERPOSITION, FINISHED_DOJO_TUTORIAL};

    public CharactersDOTableDef() {
        super("", "characters");
    }

    private CharactersDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public CharactersDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new CharactersDOTableDef("", "characters", alias));
    }

}
