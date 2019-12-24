package com.funniray.osmpcore;

import com.funniray.osmpcore.Interface.World.BukkitWorld;
import org.bukkit.Bukkit;
import org.bukkit.World;

import java.util.HashMap;

public class WorldManager {

    private static HashMap<String, BukkitWorld> worlds;

    public static BukkitWorld getWorld(World world) {
        return getWorld(world.getName());
    }

    public static BukkitWorld getWorld(String name) {
        if(worlds.containsKey(name)) {
            return worlds.get(name);
        } else {
            BukkitWorld bukkitWorld = new BukkitWorld(Bukkit.getWorld(name));
            worlds.put(name, bukkitWorld);
            return bukkitWorld;
        }
    }

}
