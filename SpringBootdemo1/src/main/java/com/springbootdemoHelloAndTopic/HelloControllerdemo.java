package com.springbootdemoHelloAndTopic;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloControllerdemo {

	@RequestMapping("/hi")
	public String sayHi() {
		return "Hi";
	}
}
