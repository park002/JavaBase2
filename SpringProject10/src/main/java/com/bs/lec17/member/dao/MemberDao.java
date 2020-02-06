package com.bs.lec17.member.dao;

import java.util.HashMap;

import java.util.Iterator;
import java.util.Set;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.bs.lec17.member.Member;
//@Repository
@Component
public class MemberDao implements IMemberDao {

	private HashMap<String, Member> dbMap; //전역변수로 사용 중 
	
	public MemberDao() { //생성자
		dbMap = new HashMap<String, Member>();
	}
	
	@Override
	public void memberInsert(String memId, String memPw, String memMail, String memPhone1, String memPhone2, String memPhone3) {
		System.out.println("memberInsert()");
		System.out.println("memId : " + memId);//박재호입니다
		System.out.println("memPw : " + memPw);
		System.out.println("memMail : " + memMail);
		System.out.println("memPhone : " + memPhone1 + " - " + memPhone2 + " - " + memPhone3);
		
		Member member = new Member();
		member.setMemId(memId);//박재호입니다
		member.setMemPw(memPw);
		member.setMemMail(memMail);
		member.setMemPhone1(memPhone1);
		member.setMemPhone2(memPhone2);
		member.setMemPhone3(memPhone3);
		
		dbMap.put(memId, member);   ////박재호입니다 외 나머지 값들 dbMap 에 저장 put 
		
		Set<String> keys = dbMap.keySet(); //키값들만 저장하는 Map 의 메소드 KeySet() 을 keys 가 사용 하겠다 
		Iterator<String> iterator = keys.iterator(); //키 값들만 반복해서  다 뽑아내겠다 
		
		while (iterator.hasNext()) { //값이 있다면 true 
			String key = iterator.next(); //key에 값을 하나 하나 저장 후 삭제 
			Member mem = dbMap.get(key);
			System.out.print("memberId:" + mem.getMemId() + "\t");
			System.out.print("|memberPw:" + mem.getMemPw() + "\t");
			System.out.print("|memberMail:" + mem.getMemMail() + "\t");
			System.out.print("|memberPhone:" + mem.getMemPhone1() + " - " + 
											   mem.getMemPhone2() + " - " + 
											   mem.getMemPhone3() + "\n");
		}
		
	}

	@Override
	public Member memberSelect(String memId, String memPw) {//박재호입니다
		Member member = dbMap.get(memId);
		
		return member;
	}

	@Override
	public void memberUpdate() {

	}

	@Override
	public void memberDelete() {

	}

}