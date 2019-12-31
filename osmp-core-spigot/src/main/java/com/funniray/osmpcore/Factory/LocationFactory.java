package com.funniray.osmpcore.Factory;

import com.funniray.osmpcore.Interface.World.BukkitWorld;
import com.funniray.osmpcore.Interface.World.Location;
import com.funniray.osmpcore.Util.ResourceManager;
import org.bukkit.Bukkit;

public class LocationFactory {

    public static Location getLocation(org.bukkit.Location location) {
        return new Location((BukkitWorld) ResourceManager.get(location.getWorld(), BukkitWorld.class), location.getX(), location.getY(), location.getZ(), location.getYaw(), location.getPitch());
    }

    public static org.bukkit.Location getBukkit(Location location) {
        return new org.bukkit.Location(Bukkit.getWorld(location.getWorld().getName()), location.getX(), location.getY(), location.getZ(), location.getYaw(), location.getPitch());
    }

}
