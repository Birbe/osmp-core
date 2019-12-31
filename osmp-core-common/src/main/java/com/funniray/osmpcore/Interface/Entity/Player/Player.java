package com.funniray.osmpcore.Interface.Entity.Player;

import com.funniray.osmpcore.Interface.Entity.Entity;
import com.funniray.osmpcore.Interface.Inventory.Inventory;
import com.funniray.osmpcore.Interface.Item.ItemStack;

public interface Player extends Entity {

    Inventory getInventory();

    ItemStack getHeldItemStack(Hand hand);

    String getUsername();

    void kick();

    void kick(String reason);

    void sendMessage(String message);

    boolean isAdmin();
}
