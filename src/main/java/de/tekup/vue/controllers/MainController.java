package de.tekup.vue.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import de.tekup.vue.dto.models.User;

@Controller
public class MainController {
	
	@GetMapping("/register")
	public String registerUser(Model model) {
		User u = new User();
		model.addAttribute("user", u);
		return "register/register_form";
	}
	
	@PostMapping("/register")
	public String registerSuccess(@ModelAttribute("user") User user) {
		System.out.println(user);
		return "register/register_success";
	}

}
