package com.funniray.osmpcore;

import com.funniray.osmpcore.Factory.OSMCFactory;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class OSMCCoreSpigot extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        OSMC.setFactory(new OSMCFactory());

        OSMC.getPackManager().loadJars();
        OSMC.getPackManager().onEnable();

        Bukkit.getPluginManager().registerEvents(new SpigotEventListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
