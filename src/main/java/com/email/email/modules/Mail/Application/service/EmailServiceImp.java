package com.email.email.modules.Mail.Application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.email.email.modules.Mail.Application.factory.EmailFactory;
import com.email.email.modules.Mail.Application.repository.EmailService;
import com.email.email.modules.Mail.Domain.model.Email;

@Service
public class EmailServiceImp implements EmailService {
    private EmailFactory emailFactory;

    @Autowired
    public EmailServiceImp(EmailFactory emailFactory) {
        this.emailFactory = emailFactory;
    }

    @Override
    public void sendEmail(Email email) {
    
    }
}
