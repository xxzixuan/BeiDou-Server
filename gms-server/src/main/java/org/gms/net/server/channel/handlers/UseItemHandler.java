/*
	This file is part of the OdinMS Maple Story Server
    Copyright (C) 2008 Patrick Huy <patrick.huy@frz.cc>
		       Matthias Butz <matze@odinms.de>
		       Jan Christian Meyer <vimes@odinms.de>

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as
    published by the Free Software Foundation version 3 as published by
    the Free Software Foundation. You may not use, modify or distribute
    this program under any other version of the GNU Affero General Public
    License.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/
package org.gms.net.server.channel.handlers;

import java.util.ArrayList;
import java.util.List;

import org.gms.client.Character;
import org.gms.client.Client;
import org.gms.client.Disease;
import org.gms.client.Stat;
import org.gms.client.inventory.InventoryType;
import org.gms.client.inventory.Item;
import org.gms.client.inventory.manipulator.InventoryManipulator;
import org.gms.config.GameConfig;
import org.gms.constants.id.ItemId;
import org.gms.constants.inventory.ItemConstants;
import org.gms.net.AbstractPacketHandler;
import org.gms.net.packet.InPacket;
import org.gms.server.ItemInformationProvider;
import org.gms.server.StatEffect;
import org.gms.util.I18nUtil;
import org.gms.util.PacketCreator;
import org.gms.util.Pair;
import org.gms.util.Randomizer;

/**
 * 使用消耗品
 * @author Matze
 */
public final class UseItemHandler extends AbstractPacketHandler {
    @Override
    public final void handlePacket(InPacket p, Client c) {
        Character chr = c.getPlayer();

        if (!chr.isAlive()) {
            c.sendPacket(PacketCreator.enableActions());
            return;
        }
        ItemInformationProvider ii = ItemInformationProvider.getInstance();
        p.readInt();
        short slot = p.readShort();
        int itemId = p.readInt();
        Item toUse = chr.getInventory(InventoryType.USE).getItem(slot);
        if (toUse != null && toUse.getQuantity() > 0 && toUse.getItemId() == itemId) {
            if (itemId == ItemId.ALL_CURE_POTION) {
                chr.dispelDebuffs();
                remove(c, slot);
                return;
            } else if (itemId == ItemId.EYEDROP) {
                chr.dispelDebuff(Disease.DARKNESS);
                remove(c, slot);
                return;
            } else if (itemId == ItemId.TONIC) {
                chr.dispelDebuff(Disease.WEAKEN);
                chr.dispelDebuff(Disease.SLOW);
                remove(c, slot);
                return;
            } else if (itemId == ItemId.HOLY_WATER) {
                chr.dispelDebuff(Disease.SEAL);
                chr.dispelDebuff(Disease.CURSE);
                remove(c, slot);
                return;
            } else if (ItemConstants.isTownScroll(itemId)) {
                int banMap = chr.getMapId();
                int banSp = chr.getMap().findClosestPlayerSpawnpoint(chr.getPosition()).getId();
                long banTime = currentServerTime();

                if (ii.getItemEffect(toUse.getItemId()).applyTo(chr)) {
                    if (GameConfig.getServerBoolean("use_banishable_town_scroll")) {
                        chr.setBanishPlayerData(banMap, banSp, banTime);
                    }

                    remove(c, slot);
                }
                return;
            } else if (ItemConstants.isAntibanishScroll(itemId)) {
                if (ii.getItemEffect(toUse.getItemId()).applyTo(chr)) {
                    remove(c, slot);
                } else {
                    chr.dropMessage(5, I18nUtil.getMessage("UseItemHandler.message1"));
                }
                return;
            }

            remove(c, slot);

            if (toUse.getItemId() != ItemId.HAPPY_BIRTHDAY) {
            	addMaxHp(itemId, chr, c);  // 喝“百事可乐”随机提高角色最大血量
                ii.getItemEffect(toUse.getItemId()).applyTo(chr);  // 使用消耗品
            } else {
                StatEffect mse = ii.getItemEffect(toUse.getItemId());
                for (Character player : chr.getMap().getCharacters()) {
                    mse.applyTo(player);
                }
            }
        }
    }

    private void remove(Client c, short slot) {
        InventoryManipulator.removeFromSlot(c, InventoryType.USE, slot, (short) 1, false);
        c.sendPacket(PacketCreator.enableActions());
    }

    /**
     * 喝“百事可乐”随机提高角色最大血量
     * @param itemId
     * @param chr
     * @param c
     */
    private void addMaxHp(int itemId, Character chr, Client c) {
        if (itemId == 2022035) {
        	List<Pair<Stat, Integer>> statupdate = new ArrayList<Pair<Stat,Integer>>();
            InventoryManipulator.removeById(c, ItemConstants.getInventoryType(itemId), itemId, 1, false, false);
            int hp = Randomizer.rand(3, 10);
            chr.setMaxHp(chr.getMaxHp() + hp);
            Pair<Stat, Integer> maxHpPair = new Pair<>(Stat.MAXHP, chr.getMaxHp());
            statupdate.add(maxHpPair);
            chr.sendPacket(PacketCreator.updatePlayerStats(statupdate, true, chr));
            chr.dropMessage(5, "成功增加最大血量" + hp + "点");
        }
    }
}
