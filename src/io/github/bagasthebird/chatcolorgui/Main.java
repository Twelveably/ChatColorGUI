package io.github.bagasthebird.chatcolorgui;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.bagasthebird.chatcolorgui.commands.GUICommand;
import io.github.bagasthebird.chatcolorgui.listeners.InventoryInteract;
import io.github.bagasthebird.chatcolorgui.listeners.OnPlayerChatEvent;

public class Main extends JavaPlugin {

	public static Main instance;

	@Override
	public void onEnable() {
		instance = this;
		this.saveDefaultConfig();
		Bukkit.getServer().getPluginManager().registerEvents(new InventoryInteract(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new OnPlayerChatEvent(), this);

		this.getCommand("chatcolor").setExecutor(new GUICommand());
	}

	@Override
	public void onDisable() {

	}
}
