package com.brms.member.dao;

import java.util.HashMap;
import java.util.Map;

import com.brms.member.Member;

public class MemberDao {

	
	private Map<String, Member> memberDB =new HashMap<String, Member>();
	
	public void insert(Member member) { ////rabbit 96539 agatha
		memberDB.put(member.getmId(), member);
		//key=> "rabbit" value=>rabbit 96539 agatha
	}
	
	public Member select(String mId){
		return memberDB.get(mId); //rabbit
		
	}
	
	public void update(Member member) {
		
	}
	
	public void delete(String mId){
		
	}
	
	public Map<String, Member> getMemberDB() {
		return memberDB;
	}
	
}
