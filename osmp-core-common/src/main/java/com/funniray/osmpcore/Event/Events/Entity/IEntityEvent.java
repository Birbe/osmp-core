package com.funniray.osmpcore.Event.Events.Entity;

import com.funniray.osmpcore.Event.IEvent;
import com.funniray.osmpcore.Interface.Entity.IEntity;

public interface IEntityEvent extends IEvent {

    IEntity getEntity();

}
