package com.funniray.osmpcore.Interface.Entity;

import com.funniray.osmpcore.Interface.World.ILocation;
import com.funniray.osmpcore.Interface.World.OLocation;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Entity;

public class OEntity implements IEntity {

    private Entity entity;

    public OEntity(Entity e) {
        this.entity = e;
    }

    @Override
    public ILocation getPosition() {
        return new OLocation(entity.getLocation());
    }

    public void setPosition(ILocation l) {
        entity.teleport(new Location(Bukkit.getWorld(l.getWorld().getName()),l.getX(),l.getY(),l.getZ()));
    }

}
