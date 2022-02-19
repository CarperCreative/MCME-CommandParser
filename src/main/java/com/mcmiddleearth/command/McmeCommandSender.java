package com.mcmiddleearth.command;

import net.md_5.bungee.api.chat.BaseComponent;

public interface McmeCommandSender {

    void sendMessage(BaseComponent[] message);

    default void sendMessage(String message) {}

    default void sendError(String message) {}

}
