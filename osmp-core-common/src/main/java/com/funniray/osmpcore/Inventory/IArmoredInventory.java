package com.funniray.osmpcore.Inventory;

import com.funniray.osmpcore.Item.IItemStack;

import java.util.Collection;

public interface IArmoredInventory extends IInventory {

    public Collection<IItemStack> getArmorSlots();

}
