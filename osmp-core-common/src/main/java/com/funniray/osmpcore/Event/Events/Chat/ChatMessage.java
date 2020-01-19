package com.funniray.osmpcore.Event.Events.Chat;

import com.funniray.osmpcore.Event.Cancellable;
import com.funniray.osmpcore.Event.BukkitEvent;
import com.funniray.osmpcore.Interface.Chat.MessageSender;

public interface ChatMessage extends BukkitEvent, Cancellable {

    String getMessage();

    void setMessage(String message);

    MessageSender getSender();

}
