package io.github.bagasthebird.chatcolorgui.listeners;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import io.github.bagasthebird.chatcolorgui.Main;

public class InventoryInteract implements Listener {

	@EventHandler
	public void OnInventoryClick(InventoryClickEvent event) {

		Player player = (Player) event.getWhoClicked();
		Inventory inventory = event.getInventory();
		ItemStack clicked = event.getCurrentItem();
		FileConfiguration config = Main.instance.getConfig();
		Main plugin = Main.instance;

		if (inventory.getName().contains(ChatColor.translateAlternateColorCodes('&', "&8&lChoose your color:"))) {
			
	        if (clicked == null || clicked.hasItemMeta() == false || clicked.getItemMeta().hasDisplayName() == false) {
	            return;
	        }
	        
			String itemname = ChatColor.stripColor(clicked.getItemMeta().getDisplayName());

			event.setCancelled(true); // cancel click

			switch (itemname) {
			case "Pink":
				config.set(player.getName(), "&d");
				plugin.saveConfig();
				break;
			case "Light Blue":
				config.set(player.getName(), "&b");
				plugin.saveConfig();
				break;
			case "Yellow":
				config.set(player.getName(), "&e");
				plugin.saveConfig();
				break;
			case "Lime":
				config.set(player.getName(), "&a");
				plugin.saveConfig();
				break;
			case "Gray":
				config.set(player.getName(), "&8");
				plugin.saveConfig();
				break;
			case "Light Gray":
				config.set(player.getName(), "&7");
				plugin.saveConfig();
				break;
			case "Cyan":
				config.set(player.getName(), "&9");
				plugin.saveConfig();
				break;
			case "Purple":
				config.set(player.getName(), "&10");
				plugin.saveConfig();
				break;
			case "Blue":
				config.set(player.getName(), "&a");
				plugin.saveConfig();
				break;
			case "Green":
				config.set(player.getName(), "&2");
				plugin.saveConfig();
				break;
			case "Red":
				config.set(player.getName(), "&c");
				plugin.saveConfig();
				break;
			case "Black":
				config.set(player.getName(), "&0");
				plugin.saveConfig();
				break;
			case "White":
				config.set(player.getName(), "&f");
				plugin.saveConfig();
				break;
			}
			
			player.closeInventory();
			player.sendMessage(itemname + " is now your chat color.");
		}
	}

}
