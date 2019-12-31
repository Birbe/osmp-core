package com.funniray.osmpcore.Event.Events.Entity;

import com.funniray.osmpcore.Event.Event;
import com.funniray.osmpcore.Interface.Entity.Entity;

public interface EntityEvent extends Event {

    Entity getEntity();

}
