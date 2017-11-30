package org.library;

import javax.persistence.Column;
import javax.persistence.Id;

public class Member {
	@Id
	@Column(name = "Member_Id")
	private int memberId;
	@Column(name = "Member_Name")
	private String name;
	@Column(name = "Member_Address")
	private String address;
	@Column(name = "Email")
	private String email;
	@Column(name = "Phone_No")
	private long phone;
	@Column(name = "Member_Type")
	private String memberType;
	public Member(int memberId, String name, String address, String email, long phone, String memberType) {
		super();
		this.memberId = memberId;
		this.name = name;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.memberType = memberType;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getMemberType() {
		return memberType;
	}
	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}
	
}