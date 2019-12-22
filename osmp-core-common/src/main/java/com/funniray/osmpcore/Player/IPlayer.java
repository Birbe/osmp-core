package com.funniray.osmpcore.Player;

import com.funniray.osmpcore.Inventory.IInventory;
import com.funniray.osmpcore.Item.IItemStack;
import com.funniray.osmpcore.Position.IPosition;

public interface IPlayer {

    public IInventory getInventory();

    public IItemStack getHeldItemStack(IHand hand);

    public IPosition getPosition();

}
