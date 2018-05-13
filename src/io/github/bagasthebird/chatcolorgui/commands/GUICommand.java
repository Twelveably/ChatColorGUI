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

		if (sender instanceof Player) { // jika pengirim command adalah player

			Player player = (Player) sender; // player
			Inventory getGUI = ChatColorGUI.getGUI(); // ambil gui yang telah dibuat di class ChatColorGUI
			
			player.openInventory(getGUI); // buka GUI
			
		}
		return true; // sukses
	}
}
