package io.github.DDSloan96.ChaosCraft;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
//import org.bukkit.event.player.*;

public class ChaosCraftCommandExecutor implements CommandExecutor{
	//private ChaosCraft plugin;

	public ChaosCraftCommandExecutor(ChaosCraft plugin){
		//this.plugin=plugin;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,String[] args) {
		if (cmd.getName().equalsIgnoreCase("slap")){
			sender.sendMessage("Command Sent");
			Bukkit.broadcastMessage("Slapped");
			Player target=(Bukkit.getServer().getPlayer(args[0]));
			Location loc=target.getLocation();
			target.teleport(new Location(loc.getWorld(),loc.getX(),loc.getY(),300));
			target.setTotalExperience(1000);
			return true;
		}
		return false;				
	}
	
	
}
