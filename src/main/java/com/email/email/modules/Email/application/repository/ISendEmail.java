/**
 * ----------------------------------------------------------------------------
 * Autor: Kaue de Matos
 * Empresa: Nova Software
 * Propriedade da Empresa: Todos os direitos reservados
 * ----------------------------------------------------------------------------
 */
package com.email.email.modules.email.application.repository;

public interface ISendEmail {
    void sendTextEmail(String to, String subject, String body);
    void sendHtmlEmail(String to, String subject, String htmlBody);
    void sendAttachmentEmail(String to, String subject, String body, String attachmentPath);
}
