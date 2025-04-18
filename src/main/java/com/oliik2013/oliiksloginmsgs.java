package com.oliik2013;

import org.bukkit.ChatColor;
import org.bukkit.command.BlockCommandSender;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;


public final class oliiksloginmsgs extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Enabling OLM...");
        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new OLMListener(this), this);

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("olm")){
            if(args.length == 0) {
                if (sender instanceof Player) {
                    Player p = (Player) sender;
                    p.sendMessage(ChatColor.AQUA + "Running Oliiks Login Msgs version: " + ChatColor.DARK_BLUE + getDescription().getVersion());
                } else if (sender instanceof ConsoleCommandSender) {
                    System.out.println(ChatColor.AQUA + "Running Oliiks Login Msgs version: " + ChatColor.DARK_BLUE + getDescription().getVersion());


                } else if (sender instanceof BlockCommandSender) {
                    System.out.println(ChatColor.AQUA + "Running Oliiks Login Msgs version: " + ChatColor.DARK_BLUE + getDescription().getVersion());

                }

            }else if (Objects.equals(args[0], "setjoinmessage")){
                StringBuilder builder = new StringBuilder();



                for(int i = 1; i < args.length; i++){
                    builder.append(args[i]);
                    builder.append(" ");
                }

                String finalMessage = builder.toString();
                finalMessage = finalMessage.stripTrailing();
                getConfig().set("join-message", finalMessage);
                saveConfig();

            }else if (Objects.equals(args[0], "setfirstjoinmessage")) {
                StringBuilder builder = new StringBuilder();


                for (int i = 1; i < args.length; i++) {
                    builder.append(args[i]);
                    builder.append(" ");
                }

                String finalMessage = builder.toString();
                finalMessage = finalMessage.stripTrailing();
                getConfig().set("frist-join-message", finalMessage);
                saveConfig();
            }else if (Objects.equals(args[0], "setleavemessage")) {
                StringBuilder builder = new StringBuilder();


                for (int i = 1; i < args.length; i++) {
                    builder.append(args[i]);
                    builder.append(" ");
                }

                String finalMessage = builder.toString();
                finalMessage = finalMessage.stripTrailing();
                getConfig().set("leave-message", finalMessage);
                saveConfig();
            }
        }

        return true;
    }




}
