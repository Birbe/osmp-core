package com.funniray.osmpcore.Event.Events.Entity;

import com.funniray.osmpcore.Event.BukkitEvent;
import com.funniray.osmpcore.Interface.Entity.Entity;

public interface EntityEvent extends BukkitEvent {

    Entity getEntity();

}
