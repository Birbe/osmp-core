package com.funniray.osmpcore.Interface.World;

import com.funniray.osmpcore.Interface.Block.Block;
import com.funniray.osmpcore.Interface.Entity.Entity;

public interface World {

    public String getName();

    public Block getBlockAt(int x, int y, int z);

    public Block getBlockAt(Position position);

    public Entity spawnEntity(String name, Location location);

}
