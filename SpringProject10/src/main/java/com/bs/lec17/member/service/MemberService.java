package com.bs.lec17.member.service;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bs.lec17.member.Member;
import com.bs.lec17.member.dao.MemberDao;


//@Service
//@Component
@Repository
public class MemberService implements IMemberService {

	@Autowired
	MemberDao dao;
	// property name= "dao" ref bean="MemberDao"

	@Override
	public void memberRegister(String memId, String memPw, String memMail, String memPhone1, String memPhone2,
			String memPhone3) {// ����ȣ�Դϴ�

		System.out.println("memberRegister()");
		System.out.println("memId : " + memId); // ����ȣ�Դϴ�
		System.out.println("memPw : " + memPw);
		System.out.println("memMail : " + memMail);
		System.out.println("memPhone : " + memPhone1 + " - " + memPhone2 + " - " + memPhone3);

		dao.memberInsert(memId, memPw, memMail, memPhone1, memPhone2, memPhone3);
	}

	@Override
	public Member memberSearch(String memId, String memPw) { // ����ȣ�Դϴ�
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
	public void memberRemove(Member member) {

	}

	private void printMembers(Map<String, Member> map) { // member

		Set<String> keys = map.keySet(); //// member keys��� ������ keySet()�޼ҵ带 ���ڴ�
		Iterator<String> iterator = keys.iterator(); // iterator �� keys�� �ݺ��ڸ� ����ϰڴ�
//		next() �޼ҵ�� �о� �� ��Ұ� �����ִ��� Ȯ���ϴ� �޼ҵ��̴�. ������ true, ������ false�� ��ȯ�Ѵ�.
		while (iterator.hasNext()) { // ���� �ִٸ� true
			String key = iterator.next();
			Member mem = map.get(key); // �� �����Ե��� mem���� ����
			printMember(mem);
		}

	}

	private void printMember(Member mem) {

		System.out.print("ID:" + mem.getMemId() + "\t");
		System.out.print("|PW:" + mem.getMemPw() + "\t");
		System.out.print("|MAIL:" + mem.getMemMail() + "\t");

		List<MemPhone> memPhones = mem.getMemPhones();
		for (MemPhone memPhone : memPhones) {
			System.out.print("|PHONE:" + memPhone.getMemPhone1() + " - " + memPhone.getMemPhone2() + " - "
					+ memPhone.getMemPhone3() + "\t");
		}

		System.out.print("|AGE:" + mem.getMemAge() + "\t");
		System.out.print("|ADULT:" + mem.isMemAdult() + "\t");
		System.out.print("|GENDER:" + mem.getMemGender() + "\t");
		System.out.print("|FAVORITE SPORTS:" + Arrays.toString(mem.getMemFSports()) + "\n");

	}

}