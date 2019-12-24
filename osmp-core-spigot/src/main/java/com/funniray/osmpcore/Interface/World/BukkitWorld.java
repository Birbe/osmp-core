package com.funniray.osmpcore.Interface.World;

import org.bukkit.World;

public class BukkitWorld implements IWorld {

    private World world;

    public BukkitWorld(World world) {
        this.world = world;
    }

    @Override
    public String getName() {
        return world.getName();
    }

    public World getWorld() {
        return world;
    }
}
