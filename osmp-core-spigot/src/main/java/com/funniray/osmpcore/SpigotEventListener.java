package com.funniray.osmpcore;

import com.funniray.osmpcore.Event.Events.IPlayerJoinEvent;
import com.funniray.osmpcore.Interface.Entity.Player.BukkitPlayer;
import com.funniray.osmpcore.Interface.Events.BukkitEventPlayerJoin;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class SpigotEventListener implements Listener {

    @EventHandler
    public void onPlayerJoinEvent(PlayerJoinEvent event) {
        BukkitPlayer bukkitPlayer = (BukkitPlayer) ResourceManager.get(event.getPlayer(), BukkitPlayer.class);
        event.getPlayer();
        BukkitEventPlayerJoin bukkitJoinEvent = new BukkitEventPlayerJoin(bukkitPlayer);
        OSMC.getPackManager().handleEvent(bukkitJoinEvent);
    }

}
