package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

public class AppController {
	@GetMapping("home")
	public String getHome() {
		return "welcome home";
	}

}
