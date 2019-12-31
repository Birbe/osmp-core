package com.funniray.osmpcore.Event.Events.Player;

import com.funniray.osmpcore.Event.Event;
import com.funniray.osmpcore.Interface.Entity.Player.Player;

public interface PlayerEvent extends Event {

    Player getPlayer();

}
