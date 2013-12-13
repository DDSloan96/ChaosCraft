/**************************************
 * 
 * 
 * @author Daniel Sloan
 * @version 0.2.2
 * This is the Main class of the ChaosCraft plugin
 * All that will happen here is the commands initialized
 * and any other basic stuff that would be pointless in its own class
 
 * 
 * 
 *****************************************/

package io.github.DDSloan96.ChaosCraft;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.player.PlayerLoginEvent;

public final class ChaosCraft extends JavaPlugin {
	@Override
	public void onEnable(){
		getLogger().info("Hello World");
		getCommand("slap").setExecutor(new Slap(this));
		getCommand("h5").setExecutor(new H5(this));
		getCommand("basscannon").setExecutor(new BassCannon(this));
	}
	 public void onPlayerLogin(PlayerLoginEvent event) {
         getLogger().info("Someone has joined your server! :D");
     }
	@Override
	public void onDisable(){
		getLogger().info("Goodbye World");
	}
}
