package com.email.email.modules.Mail.Domain.repository;

import com.email.email.common.Enum.EmailType;
import com.email.email.modules.Mail.Domain.model.Email;

public interface EmailRepository {
    Email createEmail(EmailType type, String to, String subject, String body);
}
