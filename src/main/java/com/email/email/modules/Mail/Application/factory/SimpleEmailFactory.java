package com.email.email.modules.Mail.Application.factory;

import com.email.email.common.Enum.EmailType;
import com.email.email.modules.Mail.Domain.model.Email;

public class SimpleEmailFactory implements EmailFactory {

    @Override
    public Email createEmail(EmailType type, String to, String subject, String body) {

    }    
}
