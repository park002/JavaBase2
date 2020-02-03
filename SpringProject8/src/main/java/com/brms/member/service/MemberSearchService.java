package com.brms.member.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.brms.member.Member;
import com.brms.member.dao.MemberDao;

public class MemberSearchService {

	@Autowired
	private MemberDao memberDao;

	public MemberSearchService() {
	}

	public Member searchMember(String mId) { //rabbit, "hippo", "raccoon", "elephan", "lion
		return memberDao.select(mId); //rabbit
	}

}