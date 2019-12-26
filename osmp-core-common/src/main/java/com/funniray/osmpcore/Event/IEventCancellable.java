package com.funniray.osmpcore.Event;

public interface IEventCancellable extends IEvent {

    public void setCancelled(boolean cancelled);

    public boolean isCancelled();

}
