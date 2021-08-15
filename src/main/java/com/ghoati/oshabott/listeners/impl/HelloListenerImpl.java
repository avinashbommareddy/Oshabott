package com.ghoati.oshabott.listeners.impl;

import com.ghoati.oshabott.listeners.HelloListener;
import org.javacord.api.event.message.MessageCreateEvent;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class HelloListenerImpl implements HelloListener {
    @Override
    public void onMessageCreate(MessageCreateEvent messageCreateEvent) {
        if(messageCreateEvent.getMessageContent().toLowerCase().startsWith("hello") && !messageCreateEvent.getMessageAuthor().isBotUser()) {
            messageCreateEvent.getChannel().sendMessage("Fuck off.");
        }
    }
}
