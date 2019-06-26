package com.hh.springboot.dubbo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableDubbo
@ComponentScan("com.hh.springboot.dubbo.*")
public class SpringbootDubboWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDubboWebApplication.class, args);
	}

}
