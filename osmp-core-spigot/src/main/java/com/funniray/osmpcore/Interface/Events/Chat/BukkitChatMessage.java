package com.funniray.osmpcore.Interface.Events.Chat;

import com.funniray.osmpcore.Event.Events.Chat.ChatMessage;
import com.funniray.osmpcore.Interface.Chat.BukkitPlayerMessageSender;
import com.funniray.osmpcore.Interface.Chat.MessageSender;
import com.funniray.osmpcore.Interface.Entity.Player.BukkitPlayer;
import com.funniray.osmpcore.Interface.Events.BukkitEvent;
import com.funniray.osmpcore.Util.ResourceManager;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class BukkitChatMessage extends BukkitEvent implements ChatMessage {

    private boolean cancelled;
    private MessageSender sender;
    private String message;

    public BukkitChatMessage(AsyncPlayerChatEvent event) {
        this.sender = new BukkitPlayerMessageSender((BukkitPlayer) ResourceManager.get(event.getPlayer(), BukkitPlayer.class));
        this.message = event.getMessage();
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public MessageSender getSender() {
        return sender;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

}
