package com.funniray.osmpcore;

import com.funniray.osmpcore.Event.Events.Player.PlayerInteractEvent;
import com.funniray.osmpcore.Factory.LocationFactory;
import com.funniray.osmpcore.Interface.Entity.BukkitEntity;
import com.funniray.osmpcore.Interface.Entity.Player.BukkitPlayer;
import com.funniray.osmpcore.Interface.Events.Player.*;
import com.funniray.osmpcore.Interface.World.Location;
import com.funniray.osmpcore.Util.ResourceManager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class SpigotEventListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        BukkitPlayer bukkitPlayer = (BukkitPlayer) ResourceManager.get(event.getPlayer(), BukkitPlayer.class);
        BukkitEventPlayerJoin bukkitJoinEvent = new BukkitEventPlayerJoin(bukkitPlayer);
        OSMC.getPackManager().handleEvent(bukkitJoinEvent);
    }

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        BukkitEventPlayerMove bukkitMoveEvent = new BukkitEventPlayerMove(event);
        BukkitEventPlayerMove result = (BukkitEventPlayerMove) OSMC.getPackManager().handleEvent(bukkitMoveEvent);
        event.setCancelled(result.isCancelled());
    }

    @EventHandler
    public void onProjectileLaunch(ProjectileLaunchEvent event) {
        Location location = LocationFactory.getLocation(event.getLocation());
        BukkitEntity entity = new BukkitEntity(event.getEntity());
    }

    @EventHandler
    public void onPlayerInteract(org.bukkit.event.player.PlayerInteractEvent event) {
        BukkitPlayer player = (BukkitPlayer) ResourceManager.get(event.getPlayer(), BukkitPlayer.class);
        PlayerInteractEvent playerInteractEvent = new BukkitEventPlayerInteract(event);
        playerInteractEvent = (PlayerInteractEvent) OSMC.getPackManager().handleEvent(playerInteractEvent);
        event.setCancelled(playerInteractEvent.isCancelled());
    }

    @EventHandler
    public void onPlayerDestroyBlock(BlockBreakEvent event) {
        BukkitPlayer player = (BukkitPlayer) ResourceManager.get(event.getPlayer(), BukkitPlayer.class);
        BukkitEventPlayerBreakBlock bukkitEventPlayerBreakBlock = new BukkitEventPlayerBreakBlock(event);
        bukkitEventPlayerBreakBlock = (BukkitEventPlayerBreakBlock) OSMC.getPackManager().handleEvent(bukkitEventPlayerBreakBlock);
        event.setCancelled(bukkitEventPlayerBreakBlock.isCancelled());
    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        BukkitEventBlockPlace e = new BukkitEventBlockPlace(event);
        e = (BukkitEventBlockPlace) OSMC.getPackManager().handleEvent(e);
        event.setCancelled(e.isCancelled());
    }

}
