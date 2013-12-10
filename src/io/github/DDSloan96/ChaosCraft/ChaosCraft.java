package io.github.DDSloan96.ChaosCraft;

import org.bukkit.plugin.java.JavaPlugin;

public final class ChaosCraft extends JavaPlugin {
	@Override
	public void onEnable(){
		getLogger().info("Hello World");
	}
	@Override
	public void onDisable(){
		getLogger().info("ChaosCraft is shutting down");
	}
}
