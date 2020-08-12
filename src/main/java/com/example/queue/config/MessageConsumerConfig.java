package com.example.queue.config;

import com.example.queue.environment.QueueEnvironment;
import com.example.queue.service.MessageConsumer;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConsumerConfig {
	@Bean
	public TopicExchange exchange() {
		return new TopicExchange(QueueEnvironment.EMAIL_QUEUE_EXCHANGE);
	}
    @Bean
    public Queue emailQueue() {
        return new Queue(QueueEnvironment.EMAIL_QUEUE_NAME);
    }

    @Bean
    public Binding binding(Queue emailQueue, TopicExchange exchange) {
        return BindingBuilder.bind(emailQueue).to(exchange).with(QueueEnvironment.EMAIL_QUEUE_KEY);
    }

    @Bean
    public MessageConsumer consumer() {
        return new MessageConsumer();
    }


}
