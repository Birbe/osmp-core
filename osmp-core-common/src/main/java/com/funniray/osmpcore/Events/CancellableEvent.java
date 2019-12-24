package com.funniray.osmpcore.Events;

public class CancellableEvent extends Event {

    private boolean cancelled = false;

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

}
