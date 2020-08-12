package com.example.queue.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.queue.environment.QueueEnvironment;
import com.example.queue.model.Email;

public class MessagePublisher {
	
	@Autowired
	private RabbitTemplate rabbitTemplate;

	public void publishEmailToQueue(Email email) {
		System.out.println("sending the email");
		System.out.println(email);
		rabbitTemplate.convertAndSend(QueueEnvironment.EMAIL_QUEUE_EXCHANGE, QueueEnvironment.EMAIL_QUEUE_KEY, email);
	}
}