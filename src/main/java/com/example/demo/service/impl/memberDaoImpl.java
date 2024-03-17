package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.memberMapper;
import com.example.demo.service.memberDao;
import com.example.demo.vo.member;

@Service
public class memberDaoImpl implements memberDao {

	@Autowired
	memberMapper membermapper;
	
	@Override
	public void add(member m) {
		membermapper.add(m);
	}

	@Override
	public member queryMember(String username, String password) {
		member m = membermapper.queryMember(username,password);
		if(m!=null) {
			return m;
		}else {
			return null;
		}
	}
	
	@Override
	public boolean queryUsername(String username) {
		boolean x = false;
		member m = membermapper.queryUsername(username);
		if(m!= null) {
			x= true;
		}
		return x;
	}

}
