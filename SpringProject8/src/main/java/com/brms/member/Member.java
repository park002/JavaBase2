package com.brms.member;

public class Member { //DTO

	private String mId;  // elephan
	private String mPw; //96539
	private String mName; //agatha
	
	public Member(String mId, String mPw, String mName) { //rabbit 96539 agatha
		this.mId = mId; 
		this.mPw = mPw;
		this.mName = mName;
	}

	public String getmId() {
		return mId;
	}

	public void setmId(String mId) {
		this.mId = mId;
	}

	public String getmPw() {
		return mPw;
	}

	public void setmPw(String mPw) {
		this.mPw = mPw;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}
	
}