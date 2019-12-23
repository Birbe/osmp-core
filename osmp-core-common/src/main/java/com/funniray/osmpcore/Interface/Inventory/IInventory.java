package com.funniray.osmpcore.Interface.Inventory;

import com.funniray.osmpcore.Interface.Item.IItemStack;

import java.util.Collection;

public interface IInventory {

    public Collection<IItemStack> getItems();

    public IItemStack getItemAt(int slot);

    public int getSize();

}
