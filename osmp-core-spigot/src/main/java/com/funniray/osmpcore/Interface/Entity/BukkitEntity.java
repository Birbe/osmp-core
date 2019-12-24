package com.funniray.osmpcore.Interface.Entity;

import com.funniray.osmpcore.Interface.World.ILocation;
import com.funniray.osmpcore.Interface.World.BukkitLocation;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Entity;

public class BukkitEntity implements IEntity {

    private Entity entity;

    public BukkitEntity(Entity bukkitEntity) {
        this.entity = bukkitEntity;
    }

    @Override
    public ILocation getPosition() {
        return new BukkitLocation(entity.getLocation());
    }

    public void setPosition(ILocation l) {
        entity.teleport(new Location(Bukkit.getWorld(l.getWorld().getName()),l.getX(),l.getY(),l.getZ()));
    }

}
