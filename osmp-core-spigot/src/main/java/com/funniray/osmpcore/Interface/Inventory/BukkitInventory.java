package com.funniray.osmpcore.Interface.Inventory;

import com.funniray.osmpcore.Interface.Item.ItemStack;
import com.funniray.osmpcore.Interface.Item.BukkitItemStack;

import java.util.ArrayList;
import java.util.Collection;

public class BukkitInventory implements Inventory {

    private ArrayList<ItemStack> items;
    private org.bukkit.inventory.Inventory inventory;

    public BukkitInventory(org.bukkit.inventory.Inventory inventory) {
        this.inventory = inventory;
        for(org.bukkit.inventory.ItemStack stack : inventory.getContents()) {
            BukkitItemStack ostack = new BukkitItemStack(stack);
            items.add(ostack);
        }
    }

    @Override
    public Collection<ItemStack> getItems() {
        return items;
    }

    @Override
    public ItemStack getItemAt(int slot) {
        return items.get(slot);
    }

    @Override
    public int getSize() {
        return inventory.getSize();
    }

}
