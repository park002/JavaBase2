package com.bs.lec16;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@RequestMapping("/")
	public String home(Model model) {

		System.out.println("home Method()");

		model.addAttribute("key", "home value");

		return "home";
	}

	@RequestMapping("/login")
	public String login(Model model) {

		System.out.println("login Method ()");

		model.addAttribute("key2", "login value =>jaeho good");

		return "login";

	}

	@RequestMapping("/fail")
	public String fail(Model model) {
		
		System.out.println("fail Method ()");
		
		model.addAttribute("key2", "fail호출완료");
		
		return "fail";

	}
	@RequestMapping("/success")
	public String success(Model model) {
		
		System.out.println("Success Method()");
		
		model.addAttribute("key", "success 재호성공");
		
		return "success";
		
	}

}
