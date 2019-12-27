package com.funniray.osmpcore.Event;

public interface ICancellable extends IEvent {

    public void setCancelled(boolean cancelled);

    public boolean isCancelled();

}
