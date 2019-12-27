package com.funniray.osmpcore.Event.Events.Player;

import com.funniray.osmpcore.Event.ICancellable;
import com.funniray.osmpcore.Interface.World.ILocation;

public interface IPlayerMoveEvent extends IPlayerEvent, ICancellable {

    ILocation getFrom();

    ILocation getTo();

    void setTo(ILocation to);

    void setFrom(ILocation from);

}
