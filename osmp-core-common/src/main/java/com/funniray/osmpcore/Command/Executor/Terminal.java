package com.funniray.osmpcore.Command.Executor;

public class Terminal implements CommandSender {

    @Override
    public boolean isAdmin() {
        return true;
    }

}
