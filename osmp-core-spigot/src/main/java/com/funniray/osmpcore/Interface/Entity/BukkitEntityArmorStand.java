package com.funniray.osmpcore.Interface.Entity;

import com.funniray.osmpcore.Interface.Item.BukkitItemStack;
import com.funniray.osmpcore.Interface.Item.Item;
import com.funniray.osmpcore.Interface.Item.ItemStack;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;

public class BukkitEntityArmorStand extends BukkitEntity implements EntityArmorStand {

    private ArmorStand armorStand;

    public BukkitEntityArmorStand(ArmorStand armorStand) {
        super(armorStand);

        this.armorStand = armorStand;
    }

    @Override
    public void setArmor(ItemStack[] items) {
        if(items[0] != null) armorStand.setHelmet(BukkitItemStack.getBukkit(items[0].getItem().getKey(),1 ));
        else armorStand.setHelmet(null);
        if(items[1] != null) armorStand.setChestplate(BukkitItemStack.getBukkit(items[1].getItem().getKey(),1 ));
        else armorStand.setChestplate(null);
        if(items[2] != null) armorStand.setLeggings(BukkitItemStack.getBukkit(items[2].getItem().getKey(),1 ));
        else armorStand.setLeggings(null);
        if(items[3] != null) armorStand.setBoots(BukkitItemStack.getBukkit(items[3].getItem().getKey(),1 ));
        else armorStand.setBoots(null);
    }

    @Override
    public void setVisible(boolean visible) {
        this.armorStand.setVisible(visible);
    }

    @Override
    public void setGravity(boolean gravity) {
        this.armorStand.setGravity(gravity);
    }
}
