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
public class MainClass {
    public static void main(String[] args) {
        String sender = "sender@gmail.com";
        String password = "password";
        String recipient = "chathuradhanuska@gmail.com";
        String subject = "Test email from App";
        String body = "Dear Chathura,\n\n If you are reading this email, "
                + "that means you have successfully implimented email sending service"
                + "\n\nThanks,\nApplication.";
        
        EmailHandler emailHandler = new EmailHandler(sender, password);
        if(emailHandler.sendEmail(recipient, subject, body)){
            System.out.println("Email sent to: " + recipient);
        } else {
            System.out.println("Email sending failed...");
        }
    }
}
