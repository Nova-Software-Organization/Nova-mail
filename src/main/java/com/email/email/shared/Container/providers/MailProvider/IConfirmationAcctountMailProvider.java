/**
 * ----------------------------------------------------------------------------
 * Autor: Kaue de Matos
 * Empresa: Nova Software
 * Propriedade da Empresa: Todos os direitos reservados
 * ----------------------------------------------------------------------------
 */
package com.email.email.shared.Container.providers.MailProvider;

import org.springframework.mail.javamail.MimeMessageHelper;

import jakarta.mail.MessagingException;

public interface IConfirmationAcctountMailProvider {
    void confirmationMail(MimeMessageHelper helper, String templateType, String user) throws MessagingException;
}
