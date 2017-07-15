package com.krista.thecode.controllers;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


@Controller

public class HomeController {
	@RequestMapping("/")
	public String index(@ModelAttribute("errors") String errors) {
		return "index";
	}
	
	@RequestMapping("/errors")
	public String error(RedirectAttributes redirectAttributes) {
		System.out.println("checking for errors");
		redirectAttributes.addFlashAttribute("error","You must train harder!");
		return "redirect:/";
	}

	@RequestMapping("/code")
	public String correct(@RequestParam(value="attempt") String attempt, RedirectAttributes redirectAttributes) {
		String check1 = "Bushido";
		String check2 = "bushido";
		
		if(attempt.equals(check1)) {
			return "success";
		}
		else if (attempt.equals(check2)) {
			return "success";
		}
		else {
			return "redirect:/errors";
		}
	}

}
