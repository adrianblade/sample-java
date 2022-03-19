package com.adr.example.useCase;

import com.adr.example.interactors.MessageWriter;

public class PublishMessage {
    private final MessageWriter publisher;

    public PublishMessage(MessageWriter publisher) {
        this.publisher = publisher;
    }

    public String message()  {
        return publisher.getMessage();
    }
}
