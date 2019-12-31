package com.funniray.osmpcore.Event.Events.Player;

import com.funniray.osmpcore.Event.Cancellable;
import com.funniray.osmpcore.Interface.World.Location;

public interface PlayerMoveEvent extends PlayerEvent, Cancellable {

    Location getFrom();

    Location getTo();

    void setTo(Location to);

    void setFrom(Location from);

}
