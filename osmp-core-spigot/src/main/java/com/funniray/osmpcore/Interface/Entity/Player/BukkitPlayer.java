package com.funniray.osmpcore.Interface.Entity.Player;

import com.funniray.osmpcore.Interface.Entity.BukkitEntity;
import com.funniray.osmpcore.Interface.Inventory.IInventory;
import com.funniray.osmpcore.Interface.Item.IItemStack;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

public class BukkitPlayer extends BukkitEntity implements IPlayer {

    private Player player;

    public BukkitPlayer(Player player) {
        super(player);

        this.player = player;
    }

    @Override
    public IInventory getInventory() {
        return null;
    }

    @Override
    public IItemStack getHeldItemStack(EHand hand) {
        return null;
    }

}
