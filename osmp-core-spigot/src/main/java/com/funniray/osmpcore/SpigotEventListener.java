package com.funniray.osmpcore;

import com.funniray.osmpcore.Interface.Entity.Player.BukkitPlayer;
import com.funniray.osmpcore.Interface.Events.Player.BukkitEventPlayerJoin;
import com.funniray.osmpcore.Interface.Events.Player.BukkitEventPlayerMove;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
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

}
