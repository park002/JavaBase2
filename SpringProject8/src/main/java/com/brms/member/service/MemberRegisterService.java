package com.brms.member.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.brms.member.Member;
import com.brms.member.dao.MemberDao;

public class MemberRegisterService { 

	@Autowired
	private MemberDao memberDao;

	public MemberRegisterService() {
		
	}

	public void register(Member member) { //rabbit 96539 agatha
		memberDao.insert(member); ////rabbit 96539 agatha
	}
	public void initMethod() {
		System.out.println(" initMethod()");
		
	}
	public void destroyMethod() {
		System.out.println("destroyMethod()");
	}
	
}
