package com.fundoonotes.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    @Bean
    public Queue reminderQueue() {
        return new Queue("reminder.queue", true);
    }

    @Bean
    public DirectExchange exchange() {
        return new DirectExchange("notes.exchange");
    }

    @Bean
    public Binding binding(Queue reminderQueue, DirectExchange exchange) {
        return BindingBuilder
                .bind(reminderQueue)
                .to(exchange)
                .with("reminder.created");
    }
}