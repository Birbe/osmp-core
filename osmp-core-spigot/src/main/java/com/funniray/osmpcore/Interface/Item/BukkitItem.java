package com.funniray.osmpcore.Interface.Item;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class BukkitItem implements Item {

    private Material material;

    public BukkitItem(Material material) {
        this.material = material;
    }

    @Override
    public String getName() {
        ItemStack dummyStack = new ItemStack(material);
        return dummyStack.getItemMeta().getDisplayName();
    }

    @Override
    public String getId() {
        ItemStack dummyStack = new ItemStack(material);
        return dummyStack.getType().getKey().toString();
    }
}
