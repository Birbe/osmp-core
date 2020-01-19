package com.funniray.osmpcore.Factory;

import com.funniray.osmpcore.Interface.Item.BukkitItemStack;
import com.funniray.osmpcore.Interface.Item.Item;
import com.funniray.osmpcore.Interface.Item.ItemStack;
import com.funniray.osmpcore.Util.Factory;
import org.bukkit.Bukkit;
import org.bukkit.Material;

public class OSMCFactory implements Factory {

    @Override
    public Item newItem(String key) {
        return null;
    }

    @Override
    public ItemStack newItemStack(String key, int amount) {
        return new BukkitItemStack(new org.bukkit.inventory.ItemStack(Material.getMaterial(key.toUpperCase()), amount));
    }

    @Override
    public ItemStack newItemStack(Item item, int amount) {
        //return new BukkitItemStack(new org.bukkit.inventory.ItemStack(Material.getMaterial(item.getKey().toUpperCase()), amount));
        return new BukkitItemStack(new org.bukkit.inventory.ItemStack(Material.getMaterial(item.getKey().toUpperCase()), amount));
    }

}
