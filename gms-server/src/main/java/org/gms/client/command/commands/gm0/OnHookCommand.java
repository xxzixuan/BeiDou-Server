package org.gms.client.command.commands.gm0;

import java.awt.Point;

import org.gms.client.Character;
import org.gms.client.Client;
import org.gms.client.command.Command;
import org.gms.net.netty.LoginServer;
import org.gms.util.I18nUtil;

/**
 * 离线挂机
 * @author xxzixuan@outlook.com
 */
public class OnHookCommand extends Command {
    {
        setDescription(I18nUtil.getMessage("OnHookCommand.message1"));
    }

	@Override
	public void execute(Client client, String[] params) {
		Character player = client.getPlayer();
        if (player.getMapId() != 910000000) {
        	player.dropMessage(I18nUtil.getMessage("OnHookCommand.message2"));
            return;
        }
        Point Original_Pos = player.getPosition();
        LoginServer.setChrPos(player.getId(), Original_Pos.x, Original_Pos.y);
        player.dropMessage(I18nUtil.getMessage("OnHookCommand.message3"));
        client.closeSession();
        return;
	}

}
