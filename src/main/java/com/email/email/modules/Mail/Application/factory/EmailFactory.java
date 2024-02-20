package com.email.email.modules.Mail.Application.factory;

import com.email.email.common.Enum.EmailType;
import com.email.email.modules.Mail.Domain.model.Email;

public interface EmailFactory {
    Email createEmail(EmailType type, String to, String subject, String body);
}
