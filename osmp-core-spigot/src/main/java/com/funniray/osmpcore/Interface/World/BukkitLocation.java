package com.funniray.osmpcore.Interface.World;

import com.funniray.osmpcore.Interface.Block.BukkitBlock;
import com.funniray.osmpcore.Interface.Block.IBlock;
import com.funniray.osmpcore.ResourceManager;
import org.bukkit.Location;
import org.bukkit.block.Block;

import javax.annotation.Resource;

public class BukkitLocation extends BukkitPosition implements ILocation {

    private BukkitWorld world;

    public BukkitLocation(Location l) {
        this.world = (BukkitWorld) ResourceManager.get(l, BukkitWorld.class);
        this.x = l.getX();
        this.y = l.getY();
        this.z = l.getZ();
    }

    @Override
    public IWorld getWorld() {
        return null;
    }

    @Override
    public void setWorld(IWorld world) {
        this.world = (BukkitWorld) world;
    }

    @Override
    public IBlock getBlock() {
        Block target = world.getWorld().getBlockAt( (int) x, (int) y, (int) z );
        return (BukkitBlock) ResourceManager.get(target, BukkitBlock.class);
    }

}
