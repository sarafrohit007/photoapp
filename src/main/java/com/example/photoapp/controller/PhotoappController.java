package com.example.photoapp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/api")
public class PhotoappController {

	@GetMapping(value="/method")
	public String printResult(@RequestParam("name") String name,Model model) {
		System.out.println("Printing Result....");
		model.addAttribute("name", name);
		return "dummy/greetings";
		//return "greetings";
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/method1")
	public String result1() {
		return "Success";
	}
	
}

