package com.funniray.osmpcore.Interface.World;

import org.bukkit.Location;

public class OLocation extends OPosition implements ILocation {

    public OLocation(Location l) {
        this.x = l.getX();
        this.y = l.getY();
        this.z = l.getZ();
    }

    @Override
    public IWorld getWorld() {
        return null;
    }

    @Override
    public void setWorld() {

    }

}
