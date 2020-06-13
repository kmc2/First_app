package com.example.Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	
  public static void String_data(String data) {
	  System.out.println("Hi");
	  if(data.equals("kanha")) {
		  System.out.println("Wellcome to kmc");
	  }
  }

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
