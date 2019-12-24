package com.funniray.osmpcore.Interface.Inventory;

import com.funniray.osmpcore.Interface.Item.IItemStack;
import com.funniray.osmpcore.Interface.Item.BukkitItemStack;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import java.util.ArrayList;
import java.util.Collection;

public class BukkitArmoredInventory extends OInventory implements IArmoredInventory {

    private ArrayList<IItemStack> armor;
    private PlayerInventory bukkitInventory;

    public BukkitArmoredInventory(PlayerInventory bukkitInventory) {
        super(bukkitInventory);
        this.bukkitInventory = bukkitInventory;

        ItemStack head = bukkitInventory.getArmorContents()[0];
        ItemStack chest = bukkitInventory.getArmorContents()[1];
        ItemStack legs = bukkitInventory.getArmorContents()[2];
        ItemStack boots = bukkitInventory.getArmorContents()[3];

        if(head != null) armor.set(0,new BukkitItemStack(head));
        if(chest != null) armor.set(1,new BukkitItemStack(chest));
        if(legs != null) armor.set(2,new BukkitItemStack(legs));
        if(boots != null) armor.set(3,new BukkitItemStack(boots));
    }

    @Override
    public Collection<IItemStack> getArmorSlots() {
        return armor;
    }

}
