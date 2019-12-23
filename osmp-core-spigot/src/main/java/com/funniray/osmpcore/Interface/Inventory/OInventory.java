package com.funniray.osmpcore.Interface.Inventory;

import com.funniray.osmpcore.Interface.Item.IItemStack;
import com.funniray.osmpcore.Interface.Item.OItemStack;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Collection;

public class OInventory implements IInventory {

    private ArrayList<IItemStack> items;
    private Inventory inventory;

    public OInventory(Inventory inventory) {
        this.inventory = inventory;
        for(ItemStack stack : inventory.getContents()) {
            OItemStack ostack = new OItemStack(stack);
            items.add(ostack);
        }
    }

    @Override
    public Collection<IItemStack> getItems() {
        return items;
    }

    @Override
    public IItemStack getItemAt(int slot) {
        return items.get(slot);
    }

    @Override
    public int getSize() {
        return inventory.getSize();
    }

}
