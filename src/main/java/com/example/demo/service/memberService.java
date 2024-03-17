package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.vo.member;

@Service
public interface memberService {
	void addMember(member m);
	member Login(String username,String password);
	boolean userNameRepeat(String username);
}
