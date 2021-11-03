package com.customallchat;

import net.runelite.client.events.ChatboxInput;
import net.runelite.client.events.PrivateMessageInput;

public interface ChatboxListener
{
    boolean onChatboxInput(ChatboxInput chatboxInput);

    boolean onPrivateMessageInput(PrivateMessageInput privateMessageInput);
}