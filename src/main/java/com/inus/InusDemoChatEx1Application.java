package com.inus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.inus.mybatis"})
public class InusDemoChatEx1Application {

	public static void main(String[] args) {
		SpringApplication.run(InusDemoChatEx1Application.class, args);
	}

}
