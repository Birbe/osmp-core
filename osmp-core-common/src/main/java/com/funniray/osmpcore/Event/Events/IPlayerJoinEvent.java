package com.funniray.osmpcore.Event.Events;

import com.funniray.osmpcore.Event.IEvent;
import com.funniray.osmpcore.Interface.Entity.Player.IPlayer;

public interface IPlayerJoinEvent extends IEvent {

    public IPlayer getPlayer();

}
