package br.com.fiap.easycoachauth.easycoachauth.service;

public interface EmailService {
    void sendSimpleMessage(String to, String subject, String text);
}
