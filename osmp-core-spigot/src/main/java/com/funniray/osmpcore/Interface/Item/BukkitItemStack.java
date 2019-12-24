package com.funniray.osmpcore.Interface.Item;

import org.bukkit.inventory.ItemStack;

public class BukkitItemStack implements IItemStack {

    private ItemStack itemStack;
    private BukkitItem item;
    private int quantity;

    public BukkitItemStack(ItemStack itemStackIn) {
        this.item = new BukkitItem(itemStackIn.getType());
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
