package com.funniray.osmpcore.Interface.Entity;

import com.funniray.osmpcore.Interface.World.Location;

public interface Entity {

    public Location getLocation();

    public void setLocation(Location l);

    public String getId();

}
