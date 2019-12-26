package com.funniray.osmpcore;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class OsmpCoreSpigot extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup login
        OSMC.getPackManager().loadJars();
        OSMC.getPackManager().onEnable();

        Bukkit.getPluginManager().registerEvents(new SpigotEventListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
