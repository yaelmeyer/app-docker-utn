package com.curso.docker.tp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {

	@GetMapping("/index")
	public String index() {
		return "home/index";
	}
	
//	@GetMapping("/hello")
//	public ModelAndView helloParams1(@RequestParam(name="name", required=false, defaultValue="null") String name) {
////		ModelAndView mV = new ModelAndView("")
//	}
}
