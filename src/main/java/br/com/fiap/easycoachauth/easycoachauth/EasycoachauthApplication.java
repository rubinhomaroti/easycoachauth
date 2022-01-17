package br.com.fiap.easycoachauth.easycoachauth;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@EnableRabbit
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class EasycoachauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasycoachauthApplication.class, args);
	}

}
