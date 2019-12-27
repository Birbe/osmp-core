package com.funniray.osmpcore.Event.Events.Player;

import com.funniray.osmpcore.Event.IEvent;
import com.funniray.osmpcore.Interface.Entity.Player.IPlayer;

public interface IPlayerEvent extends IEvent {

    IPlayer getPlayer();

}
