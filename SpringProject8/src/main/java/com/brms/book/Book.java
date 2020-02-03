package com.brms.book;

import com.brms.member.Member;

public class Book {

	private String bNum; //책넘버   985
	private String bTitle; //책이름 css
	private boolean bCanRental; //책대여중? true
	private Member bMember; //누가 대여했는가 ?  null 
	
	public Book(String bNum, String bTitle, boolean bCanRental, Member bMember) {
		this.bNum = bNum;
		this.bTitle = bTitle;
		this.bCanRental = bCanRental;
		this.bMember = bMember;
	}

	public String getbNum() {
		return bNum;
	}

	public void setbNum(String bNum) {
		this.bNum = bNum;
	}

	public String getbTitle() {
		return bTitle;
	}

	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}

	public boolean isbCanRental() {
		return bCanRental;
	}

	public void setbCanRental(boolean bCanRental) {
		this.bCanRental = bCanRental;
	}

	public Member getbMember() {
		return bMember;
	}

	public void setbMember(Member bMember) {
		this.bMember = bMember;
	}
	
}