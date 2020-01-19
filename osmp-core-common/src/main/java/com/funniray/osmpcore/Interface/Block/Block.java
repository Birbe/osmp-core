package com.funniray.osmpcore.Interface.Block;

import com.funniray.osmpcore.Interface.World.Location;

public interface Block {

    String getName();

    String getKey();

    Location getLocation();

    void setType(String key);

}
