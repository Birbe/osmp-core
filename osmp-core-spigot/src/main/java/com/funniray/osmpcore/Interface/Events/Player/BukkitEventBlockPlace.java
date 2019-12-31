package com.funniray.osmpcore.Interface.Events.Player;

import com.funniray.osmpcore.Event.Events.Player.BlockPlaceEvent;
import com.funniray.osmpcore.Interface.Block.Block;
import com.funniray.osmpcore.Interface.Block.BukkitBlock;
import com.funniray.osmpcore.Interface.Entity.Player.BukkitPlayer;
import com.funniray.osmpcore.Interface.Entity.Player.Player;
import com.funniray.osmpcore.Util.ResourceManager;

public class BukkitEventBlockPlace extends BukkitPlayerEvent implements BlockPlaceEvent {

    private boolean cancelled;
    private BukkitPlayer player;
    private BukkitBlock block;

    public BukkitEventBlockPlace(org.bukkit.event.block.BlockPlaceEvent event) {
        super((BukkitPlayer) ResourceManager.get(event.getPlayer(), BukkitPlayer.class));

        this.block = new BukkitBlock(event.getBlock());
        this.player = (BukkitPlayer) ResourceManager.get(event.getPlayer(), BukkitPlayer.class);
    }

    @Override
    public Block getBlock() {
        return block;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public Player getPlayer() {
        return player;
    }
}
