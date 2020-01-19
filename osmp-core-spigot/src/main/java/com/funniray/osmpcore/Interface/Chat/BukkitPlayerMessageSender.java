package com.funniray.osmpcore.Interface.Chat;

import com.funniray.osmpcore.Interface.Entity.Player.Player;

public class BukkitPlayerMessageSender extends BukkitMessageSender implements PlayerMessageSender {

    private Player player;

    public BukkitPlayerMessageSender(Player player) {
        this.player = player;
    }

    @Override
    public Player getPlayer() {
        return player;
    }
}
