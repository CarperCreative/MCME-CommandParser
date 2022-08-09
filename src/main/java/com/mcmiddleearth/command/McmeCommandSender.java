package com.mcmiddleearth.command;

import net.kyori.adventure.text.ComponentLike;
import net.md_5.bungee.api.chat.BaseComponent;

public interface McmeCommandSender {

    /**
     * @deprecated Use {@link #sendMessage(ComponentLike)} instead.
     */
    @Deprecated
    void sendMessage(BaseComponent[] message);

    void sendMessage(ComponentLike message);

    default void sendMessage(String message) {}

    default void sendError(String message) {}

}
