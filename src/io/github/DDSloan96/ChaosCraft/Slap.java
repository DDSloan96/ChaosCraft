package io.github.DDSloan96.ChaosCraft;


import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Slap implements CommandExecutor {

	public Slap(ChaosCraft plugin) {
		
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,String[] args) {
		String command=cmd.getName();
		
		if(sender instanceof Player){
			if (args[0]==null){
				sender.sendMessage("Please input an online player's name");
				return false;
			}
			if (command.equalsIgnoreCase("slap")){
				if (args.length < 1) {
		           sender.sendMessage("Not enough arguments!");
		           return false;
				}
		     else{	
		    	Player player=(Player)sender;
		    	Player target=(Bukkit.getServer().getPlayer(args[0]));
				Bukkit.broadcastMessage(player.getName()+" Slapped "+target.getName());
				Location loc=new Location(target.getServer().getWorld("world"), target.getLocation().getX(),target.getLocation().getY()+300,target.getLocation().getZ());
				target.teleport(loc);
				return true;
				}	
	        }			
		}
		else{
			sender.sendMessage("You are not a player");
			return false;
		}
		return false;
	}	
}
