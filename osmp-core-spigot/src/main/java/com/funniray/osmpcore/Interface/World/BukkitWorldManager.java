package com.funniray.osmpcore.Interface.World;

import org.bukkit.Bukkit;
import org.bukkit.WorldCreator;

public class BukkitWorldManager implements WorldManager {

    @Override
    public void unloadWorld(World world, boolean save) {
        Bukkit.unloadWorld(world.getName(), save);
    }

    public World createWorld() {
        //WorldCreator worldCreator = Bukkit.createWorld();
        return null;
    }

}
