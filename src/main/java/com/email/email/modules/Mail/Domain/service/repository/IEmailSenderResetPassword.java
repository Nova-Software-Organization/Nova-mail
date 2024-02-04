/**
 * ----------------------------------------------------------------------------
 * Autor: Kaue de Matos
 * Empresa: Nova Software
 * Propriedade da Empresa: Todos os direitos reservados
 * ----------------------------------------------------------------------------
 */
package com.email.email.modules.Mail.Domain.service.repository;

import org.springframework.http.ResponseEntity;

import com.email.email.modules.Auth.Application.response.ResponseMessageDTO;

public interface IEmailSenderResetPassword {
    ResponseEntity<ResponseMessageDTO> sendEmail(String to, String resetCode, String templateType, String user);
}
