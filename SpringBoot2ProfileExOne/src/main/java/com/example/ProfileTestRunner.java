package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class ProfileTestRunner implements CommandLineRunner {
	
	@Value("${my.db.driver}")
	private String DbName;
	@Value("${my.db.url}")
	private String dburl;

	@Override
	public void run(String... args) throws Exception {
		//System.out.println("Welcome to App");
		System.out.println(this);

	}

}
