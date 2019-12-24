package com.funniray.osmpcore.Interface.World;

import com.funniray.osmpcore.Interface.Block.BukkitBlock;
import com.funniray.osmpcore.Interface.Block.IBlock;
import com.funniray.osmpcore.WorldManager;
import org.bukkit.Location;

public class BukkitLocation extends BukkitPosition implements ILocation {

    private BukkitWorld world;

    public BukkitLocation(Location l) {
        this.world = WorldManager.getWorld(l.getWorld());
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
        return new BukkitBlock(world.getWorld().getBlockAt( (int) x, (int) y, (int) z ));
    }

}
