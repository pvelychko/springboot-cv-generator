package com.pvelychko.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ResumeController {

	@RequestMapping("/")
	public String index(Model model) {
		return "index";
	}

	@RequestMapping(value="/{username}", method=RequestMethod.GET)
	public String resume(@PathVariable String username) {
		return "resume";
	}
}
