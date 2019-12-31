package com.funniray.osmpcore.Interface.Events.Player;

import com.funniray.osmpcore.Event.Events.Player.BlockBreakEvent;
import com.funniray.osmpcore.Interface.Block.Block;
import com.funniray.osmpcore.Interface.Block.BukkitBlock;
import com.funniray.osmpcore.Interface.Entity.Player.BukkitPlayer;
import com.funniray.osmpcore.Util.ResourceManager;

public class BukkitEventPlayerBreakBlock extends BukkitPlayerEvent implements BlockBreakEvent {

    private boolean cancelled;
    private BukkitBlock block;

    public BukkitEventPlayerBreakBlock(org.bukkit.event.block.BlockBreakEvent event) {
        super((BukkitPlayer) ResourceManager.get(event.getPlayer(), BukkitPlayer.class));

        this.block = new BukkitBlock(event.getBlock());
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
}
