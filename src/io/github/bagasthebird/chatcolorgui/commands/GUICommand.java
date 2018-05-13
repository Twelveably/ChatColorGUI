package io.github.bagasthebird.chatcolorgui.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import io.github.bagasthebird.chatcolorgui.inventory.ChatColorGUI;

public class GUICommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		if (sender instanceof Player) {

			Player player = (Player) sender;
			Inventory getGUI = ChatColorGUI.getGUI();
			
			player.openInventory(getGUI);
			
		}
		return true;
	}
}
