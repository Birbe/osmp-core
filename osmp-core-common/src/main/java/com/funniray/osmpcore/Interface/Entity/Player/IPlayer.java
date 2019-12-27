package com.funniray.osmpcore.Interface.Entity.Player;

import com.funniray.osmpcore.Interface.Entity.IEntity;
import com.funniray.osmpcore.Interface.Inventory.IInventory;
import com.funniray.osmpcore.Interface.Item.IItemStack;

public interface IPlayer extends IEntity {

    IInventory getInventory();

    IItemStack getHeldItemStack(EHand hand);

    String getUsername();

    void kick();

    void kick(String reason);

    void sendMessage(String message);

}
