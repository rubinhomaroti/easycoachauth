package br.com.fiap.easycoachauth.easycoachauth.rabbitmq;

import br.com.fiap.easycoachauth.easycoachauth.service.EmailService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class QueueConsumer {

    @Autowired
    private EmailService mailSender;

    @RabbitListener(queues = {"users"})
    public void receive(@Payload String fileBody) {
        String message = "Bem vindo ao EasyCoach App! Para acessar o app com a sua nova conta: http://localhost:4200/login";
        try {
            mailSender.sendSimpleMessage(fileBody, "First access", message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}