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

		Player player = (Player) event.getWhoClicked(); // player
		Inventory inventory = event.getInventory(); // inventory
		ItemStack clicked = event.getCurrentItem(); // item yang di klik
		FileConfiguration config = Main.instance.getConfig(); // mengambil config
		Main plugin = Main.instance; // instansi Main

		if (inventory.getName().contains(ChatColor.translateAlternateColorCodes('&', "&8&lChoose your color:"))) { // jika inventory memiliki nama "&8&lChoose your color:"
			
	        if (clicked == null || clicked.hasItemMeta() == false || clicked.getItemMeta().hasDisplayName() == false) { // jika item yang diklik adalah udara/ tidak memiliki itemmeta/ tidak memiliki nama
	            return; // maka jangan lakukan apapun
	        }
	        
			String itemname = ChatColor.stripColor(clicked.getItemMeta().getDisplayName()); // mengambil nama item yang ditekan

			event.setCancelled(true); // batalkan klik, kembalikan item ke dalam inventory

			switch (itemname) { 
			case "Pink": // jika bernama "Pink"
				config.set(player.getName(), "&d"); // simpan config
				plugin.saveConfig();
				break;
			case "Light Blue": // jika bernama "Light Blue"
				config.set(player.getName(), "&b"); // simpan config
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
			
			player.closeInventory(); // tutup inventory
			player.sendMessage(itemname + " is now your chat color."); // kirim pesan sukses
		}
	}

}
