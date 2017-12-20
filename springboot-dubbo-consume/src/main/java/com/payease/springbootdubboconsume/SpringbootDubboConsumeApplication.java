package com.payease.springbootdubboconsume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
@ComponentScan("com.payease.springbootdubboconsume")
@ImportResource(locations={"classpath:dubbo-consume.xml"})
public class SpringbootDubboConsumeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDubboConsumeApplication.class, args);
	}
}
