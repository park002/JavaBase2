package com.bs.lec17.member.service;

import com.bs.lec17.member.Member;

public interface IMemberService {
	
	void memberRegister(String memId, String memPw, String memMail, String memPhone1, String memPhone2, String memPhone3); //¸â¹öµî·Ï
	
	Member memberSearch(String memId, String memPw); //¸â¹ö°Ë»ö
	
	void memberModify(); //¸â¹ö¼öÁ¤
	
	void memberRemove(); //¸â¹öÁ¦°Å
}
