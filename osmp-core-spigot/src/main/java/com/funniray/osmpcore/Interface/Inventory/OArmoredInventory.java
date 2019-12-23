package com.funniray.osmpcore.Interface.Inventory;

import com.funniray.osmpcore.Interface.Item.IItemStack;
import com.funniray.osmpcore.Interface.Item.OItemStack;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import java.util.ArrayList;
import java.util.Collection;

public class OArmoredInventory extends OInventory implements IArmoredInventory {

    private ArrayList<IItemStack> armor;

    public OArmoredInventory(PlayerInventory inventory) {
        super(inventory);

        ItemStack head = inventory.getArmorContents()[0];
        ItemStack chest = inventory.getArmorContents()[1];
        ItemStack legs = inventory.getArmorContents()[2];
        ItemStack boots = inventory.getArmorContents()[3];

        if(head != null) armor.set(0,new OItemStack(head));
        if(chest != null) armor.set(1,new OItemStack(chest));
        if(legs != null) armor.set(2,new OItemStack(legs));
        if(boots != null) armor.set(3,new OItemStack(boots));
    }

    @Override
    public Collection<IItemStack> getArmorSlots() {
        return armor;
    }

}
