package com.email.email.modules.Mail.Application.order;

import com.email.email.common.Enum.mail.TemplateEmailType;
import com.email.email.modules.Mail.Application.factory.EmailFactory;
import com.email.email.modules.Mail.Domain.model.Email;

public class OrderEmailFactory implements EmailFactory {
    @Override
    public <T> Email createEmail(TemplateEmailType type, String to, String subject, T body) {
    }    
}
