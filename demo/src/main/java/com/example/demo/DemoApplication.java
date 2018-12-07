package com.example.demo;

import java.util.Set;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication{

	
	public static void main(String[] args) throws Exception {
		 
		SpringApplication.run(DemoApplication.class, args);
	}
	@RequestMapping(value="/test")
	@ResponseBody
	public byte[] test() {
		return "I Love NaNa~!".getBytes();
	}
	public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
		
	}
	public void initialize(ConfigurableApplicationContext applicationContext) {
		System.out.println("--->"+333);
	}
			
	
}
