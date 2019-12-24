package com.funniray.osmpcore.Interface.World;

import com.funniray.osmpcore.Interface.Block.IBlock;

public interface ILocation extends IPosition {

    public IWorld getWorld();

    public void setWorld(IWorld world);

    public IBlock getBlock();

}
