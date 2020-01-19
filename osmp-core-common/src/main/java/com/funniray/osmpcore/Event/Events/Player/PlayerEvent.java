package com.funniray.osmpcore.Event.Events.Player;

import com.funniray.osmpcore.Event.BukkitEvent;
import com.funniray.osmpcore.Interface.Entity.Player.Player;

public interface PlayerEvent extends BukkitEvent {

    Player getPlayer();

}
