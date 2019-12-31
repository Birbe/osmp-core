package com.funniray.osmpcore.Interface.Item;

public class BukkitItemStack implements ItemStack {

    private org.bukkit.inventory.ItemStack itemStack;
    private BukkitItem item;
    private int quantity;

    public BukkitItemStack(org.bukkit.inventory.ItemStack itemStackIn) {
        this.item = new BukkitItem(itemStackIn.getType());
        this.itemStack = itemStackIn;
        this.quantity = itemStackIn.getAmount();
    }

    @Override
    public Item getItem() {
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
