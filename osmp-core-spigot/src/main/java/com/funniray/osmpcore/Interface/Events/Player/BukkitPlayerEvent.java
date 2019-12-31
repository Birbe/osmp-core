package com.funniray.osmpcore.Interface.Events.Player;

import com.funniray.osmpcore.Event.Events.Player.PlayerEvent;
import com.funniray.osmpcore.Interface.Entity.Player.BukkitPlayer;
import com.funniray.osmpcore.Interface.Entity.Player.Player;

public class BukkitPlayerEvent implements PlayerEvent {

    protected BukkitPlayer player;

    public BukkitPlayerEvent(BukkitPlayer player) {
        this.player = player;
    }

    public Player getPlayer() {
        return this.player;
    }

}
