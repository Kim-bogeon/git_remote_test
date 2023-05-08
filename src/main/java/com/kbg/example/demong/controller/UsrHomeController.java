package com.kbg.example.demong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UsrHomeController {
	
	private int count;
	
	public UsrHomeController() {
		count = -1;
	}
	
	
	@RequestMapping("/usr/home/main")
	@ResponseBody
	public String showMain(int count) {
		this.count = count;
		return "count의 값이 " + this.count + "으로 초기화.";
	}
	
	
}
