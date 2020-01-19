package com.funniray.osmpcore.Interface.Block;

import com.funniray.osmpcore.Factory.LocationFactory;
import com.funniray.osmpcore.Interface.World.Location;
import org.bukkit.Material;

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
    public String getKey() {
        return block.getType().getKey().toString();
    }

    @Override
    public Location getLocation() {
        return location;
    }

    @Override
    public void setType(String key) {
        this.block.setType(Material.getMaterial(key));
    }

}
