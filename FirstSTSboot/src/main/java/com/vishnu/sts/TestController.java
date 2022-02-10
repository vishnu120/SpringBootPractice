package com.vishnu.sts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	@RequestMapping("/")
	public String handelTest() {
		System.out.println("returning home page");
		return "home";
	}
	
	@RequestMapping("/contact")
	public String handelContact() {
		System.out.println("returning contact page");
		return "contact";
	}
	
	

}
