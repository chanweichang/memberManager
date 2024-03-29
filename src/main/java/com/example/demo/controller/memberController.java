package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.impl.memberServiceImpl;
import com.example.demo.vo.member;

@RestController
public class memberController {
	
	@Autowired
	memberServiceImpl msi;
	
	
	@PostMapping("/Login")
	public ModelAndView login(String username,String password) {
		member m = msi.Login(username, password);
		
		ModelAndView mav =null;
		if(m!=null) {
			mav = new ModelAndView("/loginSuccess");
		}else {
			mav = new ModelAndView("/loginError");
		}
		
		return mav;
	}
	
	@GetMapping("addMember")
	public ModelAndView goAddMember() {
		return new ModelAndView("addMember");
	}
	
}
