package com.funniray.osmpcore.Interface.Events.Player;

import com.funniray.osmpcore.Event.Events.Player.PlayerInteractEvent;
import com.funniray.osmpcore.Interface.Block.Action;
import com.funniray.osmpcore.Interface.Block.ActionUtils;
import com.funniray.osmpcore.Interface.Block.Block;
import com.funniray.osmpcore.Interface.Block.BukkitBlock;
import com.funniray.osmpcore.Interface.Entity.Player.BukkitPlayer;
import com.funniray.osmpcore.Interface.Entity.Player.Player;
import com.funniray.osmpcore.Util.ResourceManager;

public class BukkitEventPlayerInteract extends BukkitPlayerEvent implements PlayerInteractEvent {

    private org.bukkit.entity.Player spigotPlayer;
    private org.bukkit.event.block.Action spigotAction;
    private Player player;
    private Block block;
    private Action action;


    private boolean cancelled = false;

    public BukkitEventPlayerInteract(org.bukkit.event.player.PlayerInteractEvent event) {
        super((BukkitPlayer) ResourceManager.get(event.getPlayer(), BukkitPlayer.class));

        this.player = (BukkitPlayer) ResourceManager.get(event.getPlayer(), BukkitPlayer.class);
        this.spigotPlayer = event.getPlayer();
        this.action = ActionUtils.bukkitToOSMCAction(event.getAction());
        this.spigotAction = event.getAction();
        if(event.getClickedBlock() != null) this.block = new BukkitBlock(event.getClickedBlock());
    }

    @Override
    public Action getAction() {
        return this.action;
    }

    @Override
    public Block getBlock() {
        return this.block;
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
