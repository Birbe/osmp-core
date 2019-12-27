package com.funniray.osmpcore.Interface.Events.Player;

import com.funniray.osmpcore.Event.Events.Player.IPlayerEvent;
import com.funniray.osmpcore.Event.Events.Player.IPlayerMoveEvent;
import com.funniray.osmpcore.Event.ICancellable;
import com.funniray.osmpcore.Interface.Entity.Player.BukkitPlayer;
import com.funniray.osmpcore.Interface.Entity.Player.IPlayer;
import com.funniray.osmpcore.Interface.World.BukkitLocation;
import com.funniray.osmpcore.Interface.World.ILocation;
import com.funniray.osmpcore.ResourceManager;
import org.bukkit.Location;
import org.bukkit.event.player.PlayerMoveEvent;

public class BukkitEventPlayerMove extends BukkitPlayerEvent implements IPlayerMoveEvent, ICancellable {

    private PlayerMoveEvent event;
    private ILocation to;
    private ILocation from;
    private boolean cancelled;
    private BukkitPlayer player;

    public BukkitEventPlayerMove(PlayerMoveEvent event) {
        super((BukkitPlayer) ResourceManager.get(event.getPlayer(), BukkitPlayer.class));

        this.event = event;
        this.to = new BukkitLocation(event.getTo());
        this.from = new BukkitLocation(event.getFrom());
        this.player = (BukkitPlayer) ResourceManager.get(event.getPlayer(), BukkitPlayer.class);
    }

    @Override
    public ILocation getFrom() {
        return this.from;
    }

    @Override
    public ILocation getTo() {
        return this.to;
    }

    @Override
    public void setTo(ILocation to) {
        this.to = to;
    }

    @Override
    public void setFrom(ILocation from) {
        this.from = from;
    }

    @Override
    public IPlayer getPlayer() {
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
