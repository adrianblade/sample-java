package com.adr.example;


import com.adr.example.infrastructure.MessageWriterLogger;
import com.adr.example.useCase.PublishMessage;

public class ExampleApplication {

	public static void main(String[] args) {
		var messageWriter = new MessageWriterLogger();
		var publishMessage = new PublishMessage(messageWriter);
		System.out.println(publishMessage.message());
	}

}
