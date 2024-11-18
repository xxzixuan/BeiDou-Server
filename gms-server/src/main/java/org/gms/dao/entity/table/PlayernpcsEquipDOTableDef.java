package org.gms.dao.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class PlayernpcsEquipDOTableDef extends TableDef {

    /**
     * 实体类。

 @author sleep
 @since 2024-05-24
     */
    public static final PlayernpcsEquipDOTableDef PLAYERNPCS_EQUIP_D_O = new PlayernpcsEquipDOTableDef();

    public final QueryColumn ID = new QueryColumn(this, "id");

    public final QueryColumn TYPE = new QueryColumn(this, "type");

    public final QueryColumn NPCID = new QueryColumn(this, "npcid");

    public final QueryColumn EQUIPID = new QueryColumn(this, "equipid");

    public final QueryColumn EQUIPPOS = new QueryColumn(this, "equippos");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, TYPE, NPCID, EQUIPID, EQUIPPOS};

    public PlayernpcsEquipDOTableDef() {
        super("", "playernpcs_equip");
    }

    private PlayernpcsEquipDOTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public PlayernpcsEquipDOTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new PlayernpcsEquipDOTableDef("", "playernpcs_equip", alias));
    }

}
