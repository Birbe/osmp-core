package com.funniray.osmpcore.Interface.Entity;

import com.funniray.osmpcore.Interface.Item.ItemStack;

public interface EntityArmorStand extends Entity {

    void setArmor(ItemStack[] items);

    void setVisible(boolean visible);

    void setGravity(boolean gravity);

}
