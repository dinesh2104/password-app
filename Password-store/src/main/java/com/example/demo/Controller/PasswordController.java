package com.example.demo.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Model.AddPasswordModel;
import com.example.demo.Service.PasswordGenerateService;
import com.example.demo.Service.PasswordListService;

@Controller
public class PasswordController {

	@Autowired
	private PasswordGenerateService Pservice;
	@Autowired
	private PasswordListService PLservice;

	@RequestMapping(value = "/home")
	public String showHomePage() {
		return "home";
	}

	@RequestMapping(value = "/start")
	public String showStartPage() {
		return "start";
	}

	@RequestMapping(value = "/generatePassword")
	@ResponseBody
	public String generatePassword() {
		String password = Pservice.generate();
		return password;
	}

	@RequestMapping(value = "/storedpassword", method = RequestMethod.GET)
	@ResponseBody
	public List<Map<String, String>> showStoredPassword() {
		return PLservice.displayList(101L);
	}

	@RequestMapping(value = "/addpassword", method = RequestMethod.POST)
	public String addPassword(@RequestBody AddPasswordModel p1) {
		return null;
	}

	@RequestMapping(value = "/removepassword", method = RequestMethod.POST)
	public String removePassword(@RequestBody String id) {
		return null;
	}

}
