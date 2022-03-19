package com.adr.example.infrastructure;

import com.adr.example.interactors.MessageWriter;

public class MessageWriterLogger implements MessageWriter {
    @Override
    public String getMessage() {
        return "Hello World!";
    }
}
