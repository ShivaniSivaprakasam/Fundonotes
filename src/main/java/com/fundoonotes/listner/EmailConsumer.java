package com.fundoonotes.listner;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class EmailConsumer {

    @JmsListener(destination = "user.registration.queue")
    public void receiveMessage(String email) {
        System.out.println("Send verification email to: " + email);
    }
}
