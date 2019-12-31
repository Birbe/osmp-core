package com.funniray.osmpcore.Event;

public interface Cancellable extends Event {

    public void setCancelled(boolean cancelled);

    public boolean isCancelled();

}
