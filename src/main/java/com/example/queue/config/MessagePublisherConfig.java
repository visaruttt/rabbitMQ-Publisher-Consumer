package com.example.queue.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.queue.service.MessagePublisher;

@Configuration
public class MessagePublisherConfig {
	
	@Bean
	public MessagePublisher publisher() {
		return new MessagePublisher();
	}

}