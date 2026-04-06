package com.fundoonotes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class EmailProducer {

    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendRegistrationEmail(String email) {
        jmsTemplate.convertAndSend("user.registration.queue", email);
    }
}
