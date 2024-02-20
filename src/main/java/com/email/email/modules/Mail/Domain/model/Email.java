package com.email.email.modules.Mail.Domain.model;

import lombok.Data;

@Data
public class Email {
    private String to;
    private String subject;
    private String body;
}
