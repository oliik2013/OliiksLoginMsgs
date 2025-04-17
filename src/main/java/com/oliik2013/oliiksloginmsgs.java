package com.oliik2013;

import org.bukkit.ChatColor;
import org.bukkit.command.BlockCommandSender;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;


public final class oliiksloginmsgs extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Enabling OLM...");
        getServer().getPluginManager().registerEvents(new OLMListener(), this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("olm")){
            if (sender instanceof Player) {
                Player p = (Player) sender;
                p.sendMessage(ChatColor.AQUA + "Running Oliiks Login Msgs version: " + ChatColor.DARK_BLUE + getDescription().getVersion());
            }else if(sender instanceof ConsoleCommandSender){
                System.out.println(ChatColor.AQUA + "Running Oliiks Login Msgs version: " + ChatColor.DARK_BLUE + getDescription().getVersion());


            }else if(sender instanceof BlockCommandSender){
                System.out.println(ChatColor.AQUA + "Running Oliiks Login Msgs version: " + ChatColor.DARK_BLUE + getDescription().getVersion());
            }
        }

        return true;
    }

}
