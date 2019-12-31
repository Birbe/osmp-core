package com.funniray.osmpcore.Event.Events.Player;

import com.funniray.osmpcore.Event.Cancellable;
import com.funniray.osmpcore.Interface.Block.Block;

public interface BlockPlaceEvent extends PlayerEvent, Cancellable {

    Block getBlock();

}
