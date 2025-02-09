package com.example.demo.loginController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.loginForm.LoginForm;

@Controller
@RequestMapping("/wirefox")
public class LoginController {
	
	@GetMapping("/login")
	public String init(Model model) {
		model.addAttribute("form", new LoginForm());
		return "login";
	}
	
	@PostMapping("/postLogin")
	public String create(@ModelAttribute LoginForm form) {
		System.out.println(form.getUsername());
		System.out.println(form.getPassword());
		System.out.println(form.getPassword());
		return "redirect:/wirefox/login";
	}

}
