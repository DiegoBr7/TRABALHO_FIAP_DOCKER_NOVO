package br.com.fiap.gerenciamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GerenciamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GerenciamentoApplication.class, args);
	}

}
