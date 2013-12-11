package io.github.DDSloan96.ChaosCraft;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public final class ChaosCraft extends JavaPlugin {
	@Override
	public void onEnable(){
		getLogger().info("Hello World");
		System.out.println("test");
		//registerCommands();
	}
	 public void onPlayerLogin(PlayerLoginEvent event) {
         getLogger().info("Someone has joined your server! :D");
     }
	@Override
	public void onDisable(){
		getLogger().info("Goodbye World");
	}
	public boolean onCommand(CommandSender sender, Command cmd, String label,String[] args) {
		String command=cmd.getName();		
		if (args.length < 1) {
	           sender.sendMessage("Not enough arguments!");
	           return false;
	        }
		if (command.equalsIgnoreCase("slap")){
			//Player player=(Player)sender;
			sender.sendMessage("Command Sent");
			Bukkit.broadcastMessage("Slapped");
			Player target=(Bukkit.getServer().getPlayer(args[0]));
			Location loc=new Location(target.getServer().getWorld("world"), target.getLocation().getX(),target.getLocation().getY()+300,target.getLocation().getZ());
			target.teleport(loc);
			return true;
		}
		return false;
		
	}
	
	/*public void registerCommands(){
		registerCommand("slap");
	
	}*/
	
}
