package com.funniray.osmpcore.Command.Executor;

import com.funniray.osmpcore.Interface.Entity.Player.Player;

public class CommandExecutorPlayer implements CommandSender {

    private Player player;

    public CommandExecutorPlayer(Player player) {
        this.player = player;
    }

    @Override
    public boolean isAdmin() {
        return player.isAdmin();
    }

    public Player getPlayer() {
        return player;
    }

}
