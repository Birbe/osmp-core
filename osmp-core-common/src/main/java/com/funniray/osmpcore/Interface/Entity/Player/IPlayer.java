package com.funniray.osmpcore.Interface.Entity.Player;

import com.funniray.osmpcore.Interface.Entity.IEntity;
import com.funniray.osmpcore.Interface.Inventory.IInventory;
import com.funniray.osmpcore.Interface.Item.IItemStack;

public interface IPlayer extends IEntity {

    public IInventory getInventory();

    public IItemStack getHeldItemStack(IHand hand);

}
