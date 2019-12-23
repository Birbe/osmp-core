package com.funniray.osmpcore.Interface.Entity;

import com.funniray.osmpcore.Interface.World.ILocation;

public interface IEntity {

    public ILocation getPosition();

    public void setPosition(ILocation l);

}
