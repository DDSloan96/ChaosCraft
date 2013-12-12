package io.github.DDSloan96.ChaosCraft;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class H5 implements CommandExecutor {

	public H5(ChaosCraft plugin) {	
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,String[] args) {
		String command=cmd.getName();
		if (sender instanceof Player){
			if(args[0]==null){
				sender.sendMessage("Please Select an online Player");
				return false;
			}
			if (command.equalsIgnoreCase("h5")){
				if (args.length < 1) {
			           sender.sendMessage("Not enough arguments!");
			           return false;
			    }
				else{
						Player target=(Bukkit.getServer().getPlayer(args[0]));
						Bukkit.broadcastMessage(sender.getName()+" Highfived "+target.getName());
				}
			}	
		}
		else{
			sender.sendMessage("You Must Be A Player");
			return false;
		}
			
			
		return false;
	}
}	
