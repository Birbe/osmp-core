package com.funniray.osmpcore.Interface.Inventory;

import com.funniray.osmpcore.Interface.Item.IItemStack;

import java.util.Collection;

public interface IArmoredInventory extends IInventory {

    public Collection<IItemStack> getArmorSlots();

}
