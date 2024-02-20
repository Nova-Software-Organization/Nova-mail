package com.email.email.modules.Mail.Infra.messaging;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.email.email.modules.Mail.Application.repository.EmailService;

@Component
public class EmailConsumer {
    private EmailService emailService;

    @Autowired
    public EmailConsumer(EmailService emailService) {
        this.emailService = emailService;
    }

    @RabbitListener(queues = "email-queue")
    public void processEmail(EmailMessage emailMessage) {
        
    }
}
