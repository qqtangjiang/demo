package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jackson.JsonComponent;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
@Controller
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@RequestMapping(value="/test")
	@ResponseBody
	
	public byte[] test() {
		
		return "I Love NaNa!".getBytes();
	}
	@Bean(name="/test1.do")
	public org.springframework.web.servlet.mvc.Controller test1() {
		return new org.springframework.web.servlet.mvc.Controller() {

			public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
					throws Exception {
				ModelAndView mav = new ModelAndView("test1.jsp");
				return mav;
			}
			
		};
	}
}
