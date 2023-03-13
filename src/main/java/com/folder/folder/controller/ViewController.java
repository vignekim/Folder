package com.folder.folder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.folder.folder.mapper.UserMapper;

@Controller
public class ViewController {
	
	@Autowired UserMapper um;

	@GetMapping("/")
	public String home(Model model) {
		
		model.addAttribute("result", um.findAll());
		
		return "/user/List";
	}
	
}
