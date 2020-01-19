package com.funniray.osmpcore.Event;

public interface Cancellable extends BukkitEvent {

    void setCancelled(boolean cancelled);

    boolean isCancelled();

}
