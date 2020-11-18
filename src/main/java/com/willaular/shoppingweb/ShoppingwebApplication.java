package com.willaular.shoppingweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@ComponentScan({"com.willaular.shoppingweb"})
public class ShoppingwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingwebApplication.class, args);
	}

}
