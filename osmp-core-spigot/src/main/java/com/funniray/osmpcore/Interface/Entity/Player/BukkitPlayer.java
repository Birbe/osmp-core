package com.funniray.osmpcore.Interface.Entity.Player;

import com.funniray.osmpcore.Interface.Entity.BukkitEntity;
import com.funniray.osmpcore.Interface.Inventory.IInventory;
import com.funniray.osmpcore.Interface.Item.IItemStack;
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

    @Override
    public String getUsername() {
        return player.getName();
    }

    @Override
    public void kick() {
        this.player.kickPlayer("No reason provided.");
    }

    @Override
    public void kick(String reason) {
        this.player.kickPlayer(reason);
    }

    @Override
    public void sendMessage(String message) {
        this.player.sendRawMessage(message);
    }

}
