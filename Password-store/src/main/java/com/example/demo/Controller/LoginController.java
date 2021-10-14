package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	@RequestMapping(value = "/login")
	public String displayLogin() {
		return "login";
	}

	@RequestMapping(value = "/signup")
	public String displaysignup() {
		return "signup";
	}
}
