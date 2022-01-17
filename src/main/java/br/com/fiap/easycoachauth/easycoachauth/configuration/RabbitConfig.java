package br.com.fiap.easycoachauth.easycoachauth.configuration;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
    @Bean
    public Queue usersQueue() {
        return new Queue("users", true);
    }

    @Bean
    DirectExchange exchange() {
        return new DirectExchange("users.exchange");
    }

    @Bean
    Binding usersBinding(Queue usersQueue, DirectExchange exchange) {
        return BindingBuilder.bind(usersQueue).to(exchange).with("routing-key-users");
    }
}
