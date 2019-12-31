package com.funniray.osmpcore.Interface.Entity;

import com.funniray.osmpcore.Factory.LocationFactory;
import com.funniray.osmpcore.Interface.Block.Block;
import com.funniray.osmpcore.Interface.World.Location;
import org.bukkit.Bukkit;
import org.bukkit.util.BlockIterator;
import org.bukkit.util.Vector;

public class BukkitEntity implements Entity {

    private org.bukkit.entity.Entity entity;

    public BukkitEntity(org.bukkit.entity.Entity bukkitEntity) {
        this.entity = bukkitEntity;
    }

    @Override
    public Location getLocation() {
        return LocationFactory.getLocation(entity.getLocation());
    }

    public void setLocation(Location l) {
        entity.teleport(new org.bukkit.Location(Bukkit.getWorld(l.getWorld().getName()),l.getX(),l.getY(),l.getZ()));
    }

    @Override
    public String getId() {
        return entity.getName();
    }

}
