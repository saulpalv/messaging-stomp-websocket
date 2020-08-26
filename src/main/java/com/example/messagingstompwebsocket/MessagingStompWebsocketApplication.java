package com.example.messagingstompwebsocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class MessagingStompWebsocketApplication {

	public static void main(String[] args) {

		new SpringApplicationBuilder(MessagingStompWebsocketApplication.class)
				.web(WebApplicationType.SERVLET)
				.run(args);

		//new SpringApplication().setWebApplicationType(WebApplicationType.NONE);
		//SpringApplication.run(MessagingStompWebsocketApplication.class, args);
	}
}
