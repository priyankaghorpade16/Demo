package com.BikkadIT.UserApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
		Addition add = new Addition();
		int c = add.sum(10,20);
		System.out.println("addition is :" + c);
		
	}

}
