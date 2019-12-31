package com.funniray.osmpcore.Interface.Entity.Player;

import com.funniray.osmpcore.Interface.Entity.BukkitEntity;
import com.funniray.osmpcore.Interface.Inventory.Inventory;
import com.funniray.osmpcore.Interface.Item.ItemStack;

public class BukkitPlayer extends BukkitEntity implements Player {

    private org.bukkit.entity.Player player;

    public BukkitPlayer(org.bukkit.entity.Player player) {
        super(player);

        this.player = player;
    }

    @Override
    public Inventory getInventory() {
        return null;
    }

    @Override
    public ItemStack getHeldItemStack(Hand hand) {
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

    @Override
    public boolean isAdmin() {
        return player.isOp();
    }

}
