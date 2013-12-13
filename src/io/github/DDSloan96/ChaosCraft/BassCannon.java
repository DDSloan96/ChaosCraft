package io.github.DDSloan96.ChaosCraft;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BassCannon implements CommandExecutor {

	public BassCannon(ChaosCraft plugin){
		
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,String[] args) {
		String command=cmd.getName();
		if(sender instanceof Player){
			if (args[0]==null){
				sender.sendMessage("Please input an online player's name");
				return false;
			}
			if (command.equalsIgnoreCase("basscannon")){
				if (args.length < 1) {
		           sender.sendMessage("Not enough arguments!");
		           return false;
				} 
				else{
		    	 Player player=Bukkit.getServer().getPlayer(args[0]);
		    	 player.kickPlayer("You were Basscannoned off the server");
		    	 Bukkit.broadcastMessage(args[0]+" was basscannoned off the server");
		    	 Bukkit.broadcastMessage("LET THE BASSCANNON KICK IT");
		    	 return true;
				}
			}
		}
		return false;
	}
}

		
 