package com.bootcamp.web.demo_springweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
// = @SprintBootConfiuration + @EnableAutoConfiguration + @CompoentScan
// 1. ComponentScan -> Scan @Controller, @Service, @Repository @Configuration
// Scan Process -> Create object for those classes with the above Annotation
public class DemoSpringwebApplication {

	public static ApplicationContext context;
	public static void main(String[] args) {
			context = SpringApplication.run(DemoSpringwebApplication.class, args);
			for (String beanName: context.getBeanDefinitionNames()){
				System.out.println(beanName);
			}
	}

}
