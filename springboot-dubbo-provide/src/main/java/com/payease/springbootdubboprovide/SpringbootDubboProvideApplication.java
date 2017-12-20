package com.payease.springbootdubboprovide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@ComponentScan("com.payease.springbootdubboprovide")
@ImportResource(locations={"classpath:dubbo-provide.xml"})
public class SpringbootDubboProvideApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDubboProvideApplication.class, args);
	}
}
