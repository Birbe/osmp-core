package com.funniray.osmpcore.Interface.Block;

import com.funniray.osmpcore.Interface.World.BukkitLocation;
import com.funniray.osmpcore.Interface.World.ILocation;
import org.bukkit.block.Block;

public class BukkitBlock implements IBlock {

    private Block block;
    private ILocation location;

    public BukkitBlock(Block block) {
        this.block = block;
        this.location = new BukkitLocation(block.getLocation());
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getId() {
        return block.getType().getKey().toString();
    }

    @Override
    public ILocation getLocation() {
        return location;
    }

}
