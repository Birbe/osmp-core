package com.funniray.osmpcore.Interface.Events.Player;

import com.funniray.osmpcore.Event.Events.Player.PlayerMoveEvent;
import com.funniray.osmpcore.Event.Cancellable;
import com.funniray.osmpcore.Factory.LocationFactory;
import com.funniray.osmpcore.Interface.Entity.Player.BukkitPlayer;
import com.funniray.osmpcore.Interface.Entity.Player.Player;
import com.funniray.osmpcore.Interface.World.Location;
import com.funniray.osmpcore.Util.ResourceManager;

public class BukkitEventPlayerMove extends BukkitPlayerEvent implements PlayerMoveEvent, Cancellable {

    private org.bukkit.event.player.PlayerMoveEvent event;
    private Location to;
    private Location from;
    private boolean cancelled;
    private BukkitPlayer player;

    public BukkitEventPlayerMove(org.bukkit.event.player.PlayerMoveEvent event) {
        super((BukkitPlayer) ResourceManager.get(event.getPlayer(), BukkitPlayer.class));

        this.event = event;
        this.to = LocationFactory.getLocation(event.getTo());
        this.from = LocationFactory.getLocation(event.getFrom());
        this.player = (BukkitPlayer) ResourceManager.get(event.getPlayer(), BukkitPlayer.class);
    }

    @Override
    public Location getFrom() {
        return this.from;
    }

    @Override
    public Location getTo() {
        return this.to;
    }

    @Override
    public void setTo(Location to) {
        this.to = to;
    }

    @Override
    public void setFrom(Location from) {
        this.from = from;
    }

    @Override
    public Player getPlayer() {
        return this.player;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }
}
