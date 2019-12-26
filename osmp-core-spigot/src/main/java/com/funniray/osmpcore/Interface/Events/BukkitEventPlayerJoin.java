package com.funniray.osmpcore.Interface.Events;

import com.funniray.osmpcore.Event.Events.IPlayerJoinEvent;
import com.funniray.osmpcore.Interface.Entity.Player.BukkitPlayer;
import com.funniray.osmpcore.Interface.Entity.Player.IPlayer;

public class BukkitEventPlayerJoin extends BukkitEvent implements IPlayerJoinEvent {

    private BukkitPlayer player;

    public BukkitEventPlayerJoin(BukkitPlayer p) {
        this.player = p;
    }

    @Override
    public IPlayer getPlayer() {
        return player;
    }
}
