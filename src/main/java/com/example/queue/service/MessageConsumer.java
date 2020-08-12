package com.example.queue.service;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;


import lombok.extern.slf4j.Slf4j;
import com.example.queue.environment.QueueEnvironment;
import com.example.queue.model.Email;

@RabbitListener(queues = QueueEnvironment.EMAIL_QUEUE_NAME)
@Slf4j
public class MessageConsumer {

    @RabbitHandler
    public void consume(Email email) {
    	System.out.println("received email");
    	System.out.println(email);
    }

}
