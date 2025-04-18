package com.oliik2013;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import java.util.Objects;


public class OLMListener implements org.bukkit.event.Listener {

    private final oliiksloginmsgs plugin;


    public OLMListener(oliiksloginmsgs plugin) {
        this.plugin = plugin;
    }



    @EventHandler
    public void onJoin(PlayerJoinEvent e){

        Player player = e.getPlayer();
        String joinMessage = plugin.getConfig().getString("join-message");
        String fristjoinMessage = plugin.getConfig().getString("frist-join-message");



        if (player.hasPlayedBefore()) {
            if (player.getDisplayName().equals("oliik2013")) {
                e.setJoinMessage(ChatColor.RED + "The creator of OLM, " + ChatColor.DARK_RED + player.getDisplayName() + ChatColor.RED + " has joined, welcome!");
            } else {
                joinMessage = joinMessage.replace("%player%", e.getPlayer().getDisplayName());
                e.setJoinMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(joinMessage)));
            }
        }
        else{
            if (player.getDisplayName().equals("oliik2013")) {
                e.setJoinMessage(ChatColor.RED + "The creator of OLM, " + ChatColor.DARK_RED + player.getDisplayName() + ChatColor.RED + " has joined for theirs first time, welcome!");
            } else {
                fristjoinMessage = fristjoinMessage.replace("%player%", e.getPlayer().getDisplayName());
                e.setJoinMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(fristjoinMessage)));
            }
        }
    }



    @EventHandler
    public void onLeave(PlayerQuitEvent e){
        Player player = e.getPlayer();

         String leaveMessage = plugin.getConfig().getString("leave-message");


        if (player.getDisplayName().equals("oliik2013")){
            e.setQuitMessage(ChatColor.RED + "The creator of OLM, " + ChatColor.DARK_RED + player.getDisplayName() + ChatColor.RED + " has leaved.");
        }
        else {
            leaveMessage = leaveMessage.replace("%player%", e.getPlayer().getDisplayName());
            e.setQuitMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(leaveMessage)));
        }
    }

}