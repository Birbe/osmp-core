package com.funniray.osmpcore.Interface.Block;

import com.funniray.osmpcore.Factory.LocationFactory;
import com.funniray.osmpcore.Interface.World.Location;

public class BukkitBlock implements Block {

    private org.bukkit.block.Block block;
    private Location location;

    public BukkitBlock(org.bukkit.block.Block block) {
        this.block = block;
        this.location = LocationFactory.getLocation(block.getLocation());
    }

    @Override
    public String getName() {
        return "wip";
    }

    @Override
    public String getId() {
        return block.getType().getKey().toString();
    }

    @Override
    public Location getLocation() {
        return location;
    }

}
