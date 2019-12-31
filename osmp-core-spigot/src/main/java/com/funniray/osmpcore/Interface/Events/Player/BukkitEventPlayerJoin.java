package com.funniray.osmpcore.Interface.Events.Player;

import com.funniray.osmpcore.Event.Events.Player.PlayerJoinEvent;
import com.funniray.osmpcore.Interface.Entity.Player.BukkitPlayer;
import com.funniray.osmpcore.Interface.Entity.Player.Player;
import com.funniray.osmpcore.Interface.Events.BukkitEvent;

public class BukkitEventPlayerJoin extends BukkitEvent implements PlayerJoinEvent {

    private BukkitPlayer player;

    public BukkitEventPlayerJoin(BukkitPlayer p) {
        this.player = p;
    }

    @Override
    public Player getPlayer() {
        return player;
    }
}
