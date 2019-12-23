package com.funniray.osmpcore.Interface.Item;

import org.bukkit.inventory.ItemStack;

public class OItemStack implements IItemStack {

    private ItemStack itemStack;
    private OItem item;
    private int quantity;

    public OItemStack(ItemStack itemStackIn) {
        this.item = new OItem(itemStackIn.getType());
        this.itemStack = itemStackIn;
        this.quantity = itemStackIn.getAmount();
    }

    @Override
    public IItem getItem() {
        return item;
    }

    @Override
    public int getQuantity() {
        return 0;
    }

    @Override
    public int getDurability() {
        return 0;
    }

    @Override
    public int getMaxDurability() {
        return 0;
    }

}
