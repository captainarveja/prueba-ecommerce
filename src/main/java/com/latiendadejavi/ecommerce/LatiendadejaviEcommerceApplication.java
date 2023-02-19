package com.latiendadejavi.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class LatiendadejaviEcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LatiendadejaviEcommerceApplication.class, args);
	}

}
