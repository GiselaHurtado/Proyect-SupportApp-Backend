package dev.gise.supportApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class}) //con esto desactivo la seguridad.


public class SupportAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SupportAppApplication.class, args);
	}

}
