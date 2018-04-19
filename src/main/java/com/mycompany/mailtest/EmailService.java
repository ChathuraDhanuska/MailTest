/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mailtest;

/**
 *
 * @author Chathura
 */
public interface EmailService {
    
    /**
     * Facilitates the email sending 
     * @param to email of the recipient
     * @param subject Subject of the email
     * @param body body of the email
     * @return send or not
     */
    boolean sendEmail(String to, String subject, String body);
    
}
