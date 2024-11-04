package br.com.fiap.fiap_ds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FiapDsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FiapDsApplication.class, args);
	}

}
