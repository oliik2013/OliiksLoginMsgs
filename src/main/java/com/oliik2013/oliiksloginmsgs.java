package com.oliik2013;

import org.bukkit.plugin.java.JavaPlugin;

public final class oliiksloginmsgs extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Enabling OLM...");
        getServer().getPluginManager().registerEvents(new OLMListener(), this);
    }


}
