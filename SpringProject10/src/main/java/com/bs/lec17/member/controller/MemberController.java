package com.bs.lec17.member.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bs.lec17.member.Member;
import com.bs.lec17.member.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {

	@Autowired
	MemberService service;
	
	@RequestMapping(value="/memJoin", method=RequestMethod.POST)
	public String memJoin(@ModelAttribute("mem")Member member) {//Ŀ�ǵ� ��ü��� html name �� ���� member����� ���Ѵٸ� setter �� �̹� ���� �� ���� 

		
		service.memberRegister(member.getMemId(), member.getMemPw(), 
				member.getMemMail(), member.getMemPhone1(), member.getMemPhone2(), member.getMemPhone3());	
		

		return "memJoinOk";
	}
	
	@RequestMapping(value="/memLogin", method=RequestMethod.POST)
	public String memLogin(Model model, @RequestParam("memId") String memId
			,@RequestParam(value="memPw",required=false, defaultValue = "1234") String memPw ) {
		
		//String memId = request.getParameter("memId"); ////����ȣ�Դϴ�
		//String memPw = request.getParameter("memPw");
		
		Member member = service.memberSearch(memId, memPw);//����ȣ�Դϴ�
		
		try {
			model.addAttribute("memId", member.getMemId()); //����ȣ�Դϴ�
			model.addAttribute("memPw", member.getMemPw()); //1234
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "memLoginOk";
	}
	
	@RequestMapping(value="/memRemove", method=RequestMethod.POST)
	public String memRemove(@ModelAttribute("mem")Member member) {
		service.memberRemove(member);
		
		return "memRemove";
	}
	

	
}