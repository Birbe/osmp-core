package com.funniray.osmpcore.Interface.Item;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class OItem implements IItem {

    private Material material;

    public OItem(Material material) {
        this.material = material;
    }

    @Override
    public String getName() {
        ItemStack dummyStack = new ItemStack(material);
        return dummyStack.getItemMeta().getDisplayName();
    }

    @Override
    public int getId() {
        return material.getId(); //TODO: this is deprecated so a new system will need to be made later
    }
}
