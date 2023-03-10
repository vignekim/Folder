package com.folder.folder.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

	@GetMapping("/")
	public String home(Model model) {
		String name = "스티븐";
		String email = "jobs@shellfolder.com";
		String regDate =  "2023-02-28";
		
		List<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("name", name);
		map.put("email", email);
		map.put("regDate", regDate);
		
		list.add(map);
		
		map = new HashMap<String, String>();
		
		map.put("name", "사용자");
		map.put("email", "user@shellfolder.com");
		map.put("regDate", "2023-03-10");
		
		list.add(map);
		
		model.addAttribute("result", list);
		
		return "/user/List";
	}
	
}
