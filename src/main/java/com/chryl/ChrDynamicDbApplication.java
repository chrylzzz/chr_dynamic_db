package com.chryl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class ChrDynamicDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChrDynamicDbApplication.class, args);
	}

}
