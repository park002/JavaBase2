package com.bs.lec17.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.bs.lec17.member.Member;
import com.bs.lec17.member.dao.MemberDao;


//@Service
//@Component
@Repository
public class MemberService implements IMemberService {

	@Autowired
	MemberDao dao;
	//property name= "dao" ref bean="MemberDao"
	
	@Override
	public void memberRegister(String memId, String memPw, String memMail,String memPhone1, String memPhone2, String memPhone3) 
	{//����ȣ�Դϴ�
		
		System.out.println("memberRegister()");
		System.out.println("memId : " + memId); //����ȣ�Դϴ�
		System.out.println("memPw : " + memPw);
		System.out.println("memMail : " + memMail);
		System.out.println("memPhone : " + memPhone1 + " - " + memPhone2 + " - " + memPhone3);
		
		dao.memberInsert(memId, memPw, memMail, memPhone1, memPhone2, memPhone3);
	}

	@Override
	public Member memberSearch(String memId, String memPw) { //����ȣ�Դϴ�
		System.out.println("memberSearch()");
		System.out.println("memId : " + memId);
		System.out.println("memPw : " + memPw);
		
		Member member = dao.memberSelect(memId, memPw);
		
		return member;
	}

	@Override
	public void memberModify() {
		
	}

	@Override
	public void memberRemove() {
		
	}

}