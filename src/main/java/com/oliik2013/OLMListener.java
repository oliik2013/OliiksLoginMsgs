package com.oliik2013;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerQuitEvent;

public class OLMListener implements org.bukkit.event.Listener {

    @EventHandler
    public void onLeave(PlayerQuitEvent e){
        Player player = e.getPlayer();

        if (player.getDisplayName().equals("oliik2013")){
            e.setQuitMessage("§cThe creator of OLM has leaved.");
        }
        else {
            e.setQuitMessage("§5" + player.getDisplayName() + " have leaved, lets wait for them to come back.");
        }
    }

}

// https://youtu.be/Ipm0wPEwl4U?list=PLfu_Bpi_zcDNEKmR82hnbv9UxQ16nUBF7&t=304