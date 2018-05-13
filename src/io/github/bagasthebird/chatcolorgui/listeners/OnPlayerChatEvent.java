package io.github.bagasthebird.chatcolorgui.listeners;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import io.github.bagasthebird.chatcolorgui.Main;

public class OnPlayerChatEvent implements Listener {
	@EventHandler
	public void onPlayerChatEvent(AsyncPlayerChatEvent event) {
		
		String playerName = event.getPlayer().getName();
		FileConfiguration config = Main.instance.getConfig();

		if (config.contains(playerName)) {
			event.setMessage(ChatColor.translateAlternateColorCodes('&', config.getString(playerName) + event.getMessage()));
		}
	}
}
