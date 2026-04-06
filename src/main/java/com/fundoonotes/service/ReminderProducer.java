package com.fundoonotes.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReminderProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendReminder(String message) {
        rabbitTemplate.convertAndSend(
                "notes.exchange",
                "reminder.created",
                message
        );
    }
}