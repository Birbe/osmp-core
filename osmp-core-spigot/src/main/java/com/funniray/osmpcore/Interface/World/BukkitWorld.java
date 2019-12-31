package com.funniray.osmpcore.Interface.World;

import com.funniray.osmpcore.Factory.LocationFactory;
import com.funniray.osmpcore.Interface.Block.Block;
import com.funniray.osmpcore.Interface.Block.BukkitBlock;
import com.funniray.osmpcore.Interface.Entity.BukkitEntity;
import com.funniray.osmpcore.Interface.Entity.Entity;
import org.bukkit.entity.EntityType;

public class BukkitWorld implements World {

    private org.bukkit.World world;

    public BukkitWorld(org.bukkit.World world) {
        this.world = world;
    }

    @Override
    public String getName() {
        return world.getName();
    }

    @Override
    public Block getBlockAt(int x, int y, int z) {
        return new BukkitBlock(world.getBlockAt(x,y,z));
    }

    public org.bukkit.World getWorld() {
        return world;
    }

    public Block getBlockAt(Position position) {
        return new BukkitBlock(world.getBlockAt((int)position.getX(), (int)position.getY(), (int)position.getZ()));
    }

    @Override
    public Entity spawnEntity(String name, Location l) {
        BukkitEntity out;
        EntityType eType = null;
        for(EntityType type : EntityType.values()) {
            if(type.getName().equalsIgnoreCase(name)) eType = type;
        }
        if(eType == null) return null;
        else {
            out = new BukkitEntity(world.spawnEntity(LocationFactory.getBukkit(l), eType));
            return out;
        }
    }

    public void updateBlockAt() {

    }

}
