package com.br.pecas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.br.pecas")
@EnableJpaRepositories(basePackages = "com.br.pecas.repository")
public class PecasApplication {

	public static void main(String[] args) {
		SpringApplication.run(PecasApplication.class, args);
	}

}
