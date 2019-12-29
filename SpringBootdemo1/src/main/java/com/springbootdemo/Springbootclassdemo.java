package com.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan    //when we used blank ComponentScan that time package of main class and annotated clasess is same
@ComponentScan(basePackages= {"com.springbootdemoHelloAndTopic"})
public class Springbootclassdemo {

	public static void main(String[] args) {
		SpringApplication.run(Springbootclassdemo.class, args);
	}
}
