package io.github.bagasthebird.chatcolorgui;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.bagasthebird.chatcolorgui.commands.GUICommand;
import io.github.bagasthebird.chatcolorgui.listeners.InventoryInteract;
import io.github.bagasthebird.chatcolorgui.listeners.OnPlayerChatEvent;

public class Main extends JavaPlugin {

	public static Main instance; // instansi dari main

	@Override
	public void onEnable() { // saat plugin nyala
		instance = this; // initialisasi dari instansi
		this.saveDefaultConfig(); // membuat config
		Bukkit.getServer().getPluginManager().registerEvents(new InventoryInteract(), this); // mendaftarkan event dalam class InventoryInteract
		Bukkit.getServer().getPluginManager().registerEvents(new OnPlayerChatEvent(), this); // mendaftarkan event dalam class OnPlayerChatEvent

		this.getCommand("chatcolor").setExecutor(new GUICommand()); // mendaftarkan command 
	}

	@Override
	public void onDisable() { // saat plugin shut down

	}
}
