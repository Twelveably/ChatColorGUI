package io.github.bagasthebird.chatcolorgui.inventory;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ChatColorGUI {
	
	public static Inventory getGUI() {

		ItemStack magenta = createItem(new ItemStack(Material.WOOL, 1, (byte) 2),
				ChatColor.translateAlternateColorCodes('&', "&d&lPink"), new String[] {});
		
		ItemStack lightblue = createItem(new ItemStack(Material.WOOL, 1, (byte) 3),
				ChatColor.translateAlternateColorCodes('&', "&b&lLight Blue"), new String[] {});
		
		ItemStack yellow = createItem(new ItemStack(Material.WOOL, 1, (byte) 4),
				ChatColor.translateAlternateColorCodes('&', "&e&lYellow"), new String[] {});
		
		ItemStack lime = createItem(new ItemStack(Material.WOOL, 1, (byte) 5),
				ChatColor.translateAlternateColorCodes('&', "&a&lLime"), new String[] {});

		ItemStack gray = createItem(new ItemStack(Material.WOOL, 1, (byte) 7),
				ChatColor.translateAlternateColorCodes('&', "&8&lGray"), new String[] {});
		
		ItemStack lightgray = createItem(new ItemStack(Material.WOOL, 1, (byte) 8),
				ChatColor.translateAlternateColorCodes('&', "&7&lLight Gray"), new String[] {});
		
		ItemStack cyan = createItem(new ItemStack(Material.WOOL, 1, (byte) 9),
				ChatColor.translateAlternateColorCodes('&', "&3&lCyan"), new String[] {});
		
		ItemStack purple = createItem(new ItemStack(Material.WOOL, 1, (byte) 10),
				ChatColor.translateAlternateColorCodes('&', "&5&lPurple"), new String[] {});
		
		ItemStack blue = createItem(new ItemStack(Material.WOOL, 1, (byte) 11),
				ChatColor.translateAlternateColorCodes('&', "&1&lBlue"), new String[] {});
		
		ItemStack green = createItem(new ItemStack(Material.WOOL, 1, (byte) 13),
				ChatColor.translateAlternateColorCodes('&', "&2&lGreen"), new String[] {});
		
		ItemStack red = createItem(new ItemStack(Material.WOOL, 1, (byte) 14),
				ChatColor.translateAlternateColorCodes('&', "&c&lRed"), new String[] {});
		
		ItemStack black = createItem(new ItemStack(Material.WOOL, 1, (byte) 15),
				ChatColor.translateAlternateColorCodes('&', "&8&lBlack"), new String[] {});
		
		ItemStack white = createItem(new ItemStack(Material.WOOL, 1, (byte) 0),
				ChatColor.translateAlternateColorCodes('&', "&f&lWhite"), new String[] {});

		ItemStack[] items = new ItemStack[13];
		{
			items[0] = magenta;
			items[1] = lightblue;
			items[2] = yellow;
			items[3] = lime;
			items[4] = gray;
			items[5] = lightgray;
			items[6] = cyan;
			items[7] = purple;
			items[8] = blue;
			items[9] = green;
			items[10] = red;
			items[11] = black;
			items[12] = white;
		}

		Inventory chatColorGUI = Bukkit.createInventory(null, 27,
				ChatColor.translateAlternateColorCodes('&', "&8&lChoose your color:"));
		
	    for (int itemstacks = 0; itemstacks < 13; itemstacks++)
		chatColorGUI.setItem(itemstacks,
				items[(itemstacks + 0)
				% items.length]);

		return chatColorGUI;
	}

	public static ItemStack createItem(ItemStack item, String name, String[] lore) {
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(name);
		im.setLore(Arrays.asList(lore));
		item.setItemMeta(im);
		return item;
	}
	
}
