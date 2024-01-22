package com.vivek.myfirstwebapplication.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	
	@RequestMapping("say-hello")
	@ResponseBody
	public String hello() {
		return "Hello spring boot";
	}
	
	@RequestMapping("say-hello-jsp")
	public String sayhellojsp() {
		return "sayhello";
	}
}

