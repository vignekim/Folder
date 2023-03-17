package com.folder.folder.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.folder.folder.mapper.UserMapper;

@Controller
public class ViewController {
	
	@Autowired UserMapper um;

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("result", um.findAll());
		return "user/List";
	}
	
	@GetMapping("/findById/{no}")
	public String findById(@PathVariable("no") int no, Model model) {
		model.addAttribute("result", um.findById(no));
		return "user/Select";
	}
	
	@GetMapping("/editById/{no}")
	public String editById(@PathVariable("no") int no, Model model) {
		model.addAttribute("result", um.findById(no));
		return "user/Update";
	}
	
	@PostMapping("/editById")
	public String editById(@RequestParam Map<String, Object> paramMap) {
		int state = um.editById(paramMap);
		return "redirect:/findById/" + paramMap.get("no");
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("no") int no) {
		int state = um.delete(no);
		return "redirect:/";
	}
	
	@GetMapping("/save")
	public String save() {
		return "user/Create";
	}
	
	@PostMapping("/save")
	public String save(@RequestParam Map<String, Object> paramMap) {
		int state = um.save(paramMap);
		int no = um.findByNo();
		return "redirect:/findById/" + no;
	}
	
}
