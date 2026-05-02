package com.hari.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@GetMapping("/")
	@ResponseBody
	public String practice() {
		return "welcome to home page.., go head: executing from the SIT branch";
	}
	@GetMapping("/home")
	public String home() {
		return "home";
	}
}
