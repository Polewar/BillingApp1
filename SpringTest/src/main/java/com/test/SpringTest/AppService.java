package com.test.SpringTest;


import org.springframework.stereotype.Component;

@Component
public class AppService {
 
	public String sayHelloWorld() {
		return "Hello World !";
	}
 
}