package com.funniray.osmpcore.Interface.Inventory;

import com.funniray.osmpcore.Interface.Item.ItemStack;

import java.util.Collection;

public interface Inventory {

    public Collection<ItemStack> getItems();

    public ItemStack getItemAt(int slot);

    public int getSize();

}
