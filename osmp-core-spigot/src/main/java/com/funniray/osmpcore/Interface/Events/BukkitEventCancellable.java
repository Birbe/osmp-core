package com.funniray.osmpcore.Interface.Events;

import com.funniray.osmpcore.Event.IEventCancellable;

public class BukkitEventCancellable extends BukkitEvent implements IEventCancellable {

    private boolean isCancelled = false;

    @Override
    public void setCancelled(boolean cancelled) {
        this.isCancelled = cancelled;
    }

    @Override
    public boolean isCancelled() {
        return this.isCancelled;
    }

}
