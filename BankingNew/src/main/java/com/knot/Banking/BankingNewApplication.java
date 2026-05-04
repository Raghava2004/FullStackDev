package com.knot.Banking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
//@EnableDiscoveryClient
@EntityScan(basePackages = "com.knot.Banking.Model")
public class BankingNewApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingNewApplication.class, args);
	}

}
