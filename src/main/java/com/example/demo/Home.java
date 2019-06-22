package com.example.demo;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {
	@GetMapping("/")  
	public String home(Map<String, Object> model) {
		model.put("message", "Hello Thymeleaf");
		System.out.println("213");
		return "index";//°æ·Î¸í
	}

}
