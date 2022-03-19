package com.adr.example.useCase;

import com.adr.example.interactors.MessageWriter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PublishMessageTest {

    @Mock
    private MessageWriter messageWriter;

    @Test
    void fromScopeAndParams() {
        var expected = "Hi from Spain!";
        var publishMessage = new PublishMessage(messageWriter);

        when(messageWriter.getMessage()).thenReturn(expected);

        assertEquals(expected, publishMessage.message());
    }
}
