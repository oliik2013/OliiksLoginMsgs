package com.oliik2013;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class OLMListener implements org.bukkit.event.Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e){

        Player player = e.getPlayer();

        if (player.hasPlayedBefore()) {
            if (player.getDisplayName().equals("oliik2013")) {
                e.setJoinMessage(ChatColor.RED + "The creator of OLM, " + ChatColor.DARK_RED + player.getDisplayName() + ChatColor.RED + " has joined, welcome!");
            } else {
                e.setJoinMessage(ChatColor.AQUA + "Welcome back to the server, " + ChatColor.BLUE + player.getDisplayName());
            }
        }
        else{
            if (player.getDisplayName().equals("oliik2013")) {
                e.setJoinMessage(ChatColor.RED + "The creator of OLM, " + ChatColor.DARK_RED + player.getDisplayName() + ChatColor.RED + " has joined for theirs first time, welcome!");
            } else {
                e.setJoinMessage(ChatColor.DARK_PURPLE + player.getDisplayName() + ChatColor.LIGHT_PURPLE + " Has joined for theirs first time! Welcome!");
            }
        }
    }



    @EventHandler
    public void onLeave(PlayerQuitEvent e){
        Player player = e.getPlayer();

        if (player.getDisplayName().equals("oliik2013")){
            e.setQuitMessage(ChatColor.RED + "The creator of OLM, " + ChatColor.DARK_RED + player.getDisplayName() + ChatColor.RED + " has leaved.");
        }
        else {
            e.setQuitMessage(ChatColor.BLUE + player.getDisplayName() + ChatColor.AQUA + " have leaved, lets wait for them to come back.");
        }
    }

}