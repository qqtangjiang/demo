package com.example.demo;

import java.util.logging.LogManager;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(DemoApplication.class.getName());
		logger.info("fffffffffffff");
		org.slf4j.Logger log = LoggerFactory.getLogger(DemoApplication.class);
		log.info("asdfadsf");
		SpringApplication.run(DemoApplication.class, args);
	}
	@RequestMapping(value="/test")
	@ResponseBody
	public byte[] test() {
		
		return "I Love NaNa!".getBytes();
	}
	@RequestMapping(value="/test1")
	@ResponseBody
	public Bean1 test12() {
		new Exception().printStackTrace();
		return new Bean1("dfaf",23);
	}
	class Bean1{
		String a;
		int i;
		public Bean1(String a,int b) {
			this.a=a;
			this.i=b;
		}
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
