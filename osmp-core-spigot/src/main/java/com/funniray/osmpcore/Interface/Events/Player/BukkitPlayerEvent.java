package com.funniray.osmpcore.Interface.Events.Player;

import com.funniray.osmpcore.Event.Events.Player.IPlayerEvent;
import com.funniray.osmpcore.Interface.Entity.Player.BukkitPlayer;
import com.funniray.osmpcore.Interface.Entity.Player.IPlayer;

public class BukkitPlayerEvent implements IPlayerEvent {

    protected BukkitPlayer player;

    public BukkitPlayerEvent(BukkitPlayer player) {
        this.player = player;
    }

    public IPlayer getPlayer() {
        return this.player;
    }

}
