package com.funniray.osmpcore.Util;

import com.funniray.osmpcore.Interface.Item.Item;
import com.funniray.osmpcore.Interface.Item.ItemStack;

public interface Factory {

    Item newItem(String key);

    ItemStack newItemStack(String key, int amount);

    ItemStack newItemStack(Item item, int amount);

}
