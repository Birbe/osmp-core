package com.funniray.osmpcore;

import com.funniray.osmpcore.JarLoader.JarLoader;
import org.bukkit.plugin.java.JavaPlugin;

import java.nio.file.Path;
import java.nio.file.Paths;

public final class OsmpCoreSpigot extends JavaPlugin {

    private OSMP osmp;

    @Override
    public void onEnable() {
        // Plugin startup login

        this.osmp = new OSMP();
        osmp.onEnable();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
