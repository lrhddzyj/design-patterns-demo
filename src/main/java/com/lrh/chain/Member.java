package com.lrh.chain;

public class Member {

	public Member(String name, MemberLevel memberLevel) {
		this.name = name;
		this.memberLevel = memberLevel;
	}

	private String name;

	private MemberLevel memberLevel;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MemberLevel getMemberLevel() {
		return memberLevel;
	}

	public void setMemberLevel(MemberLevel memberLevel) {
		this.memberLevel = memberLevel;
	}

	@Override
	public String toString() {
		return "Member{" +
				"name='" + name + '\'' +
				", memberLevel=" + memberLevel +
				'}';
	}
}
