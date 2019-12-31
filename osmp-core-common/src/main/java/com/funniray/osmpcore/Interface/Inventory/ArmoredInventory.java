package com.funniray.osmpcore.Interface.Inventory;

import com.funniray.osmpcore.Interface.Item.ItemStack;

import java.util.Collection;

public interface ArmoredInventory extends Inventory {

    public Collection<ItemStack> getArmorSlots();

}
