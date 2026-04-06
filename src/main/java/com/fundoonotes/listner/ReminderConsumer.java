package com.fundoonotes.listner;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ReminderConsumer {

    @RabbitListener(queues = "reminder.queue")
    public void receiveReminder(String message) {
        System.out.println("Reminder received: " + message);
    }
}