package com.funniray.osmpcore.Interface.World;

import org.bukkit.World;

public class OWorld implements IWorld {

    private World world;

    public OWorld(World world) {
        this.world = world;
    }

    @Override
    public String getName() {
        return world.getName();
    }
}
