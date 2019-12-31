package com.funniray.osmpcore.Command;

import com.funniray.osmpcore.Event.Event;

public abstract class Command {

    public String getName() {
        return null;
    }

    public String getUsage() {
        return null;
    }

    public String getPermissionNode() {
        return null;
    }

    public String[] getAliases() {
        return null;
    }
}
