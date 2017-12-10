package com.test.SpringTest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
 
@Controller
public class AppController {
 
	@Autowired
	private AppService appService;
	
	@RequestMapping("/")
    @ResponseBody
	public String helloWorld() {
		return appService.sayHelloWorld();
	}
}