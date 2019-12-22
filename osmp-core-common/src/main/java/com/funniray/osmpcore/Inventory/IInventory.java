package com.funniray.osmpcore.Inventory;

import com.funniray.osmpcore.Item.IItemStack;

import java.util.Collection;

public interface IInventory {

    public Collection<IItemStack> getItems();

    public IItemStack getItemAt(int slot);

    public int getMaxSlots();

}
