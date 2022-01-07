package br.com.fiap.easycoachauth.easycoachauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class EasycoachauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasycoachauthApplication.class, args);
	}

}
