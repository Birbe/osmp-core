package com.funniray.osmpcore.Interface.Item;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class BukkitItem implements Item {

    private Material material;

    public BukkitItem(Material material) {
        this.material = material;
    }

    public String getKey() {
        ItemStack dummyStack = new ItemStack(material);
        return dummyStack.getType().getKey().getKey();
    }
}
