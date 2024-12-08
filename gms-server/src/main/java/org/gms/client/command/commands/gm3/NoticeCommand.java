/*
    This file is part of the HeavenMS MapleStory Server, commands OdinMS-based
    Copyleft (L) 2016 - 2019 RonanLana

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

/*
   @Author: Arthur L - Refactored command content into modules
*/
package org.gms.client.command.commands.gm3;

import org.gms.client.Character;
import org.gms.client.Client;
import org.gms.client.command.Command;
import org.gms.net.server.Server;
import org.gms.net.server.channel.Channel;
import org.gms.util.I18nUtil;

public class NoticeCommand extends Command {
    {
        setDescription(I18nUtil.getMessage("NoticeCommand.message1"));
    }

    @Override
    public void execute(Client c, String[] params) {

    	Character player = c.getPlayer();
    	for (Channel ch : Server.getInstance().getAllChannels()) {
            for (Character mch : ch.getPlayerStorage().getAllCharacters()) {
                mch.startMapEffect(player.getLastCommandMessage(), 5121015); // 5121009
            }
        }

//    	Server.getInstance().broadcastMessage(c.getWorld(), PacketCreator.serverNotice(6, I18nUtil.getMessage("NoticeCommand.message2", player.getLastCommandMessage())));
    }
}
