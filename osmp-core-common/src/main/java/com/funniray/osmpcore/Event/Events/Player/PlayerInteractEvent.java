package com.funniray.osmpcore.Event.Events.Player;

import com.funniray.osmpcore.Event.Cancellable;
import com.funniray.osmpcore.Interface.Block.Action;
import com.funniray.osmpcore.Interface.Block.Block;

public interface PlayerInteractEvent extends PlayerEvent, Cancellable {

    Action getAction();

    Block getBlock();

}
