package com.lrh.prototype;

public class Notice implements Cloneable{

	private String receiver;

	private String subject;

	private String msg;

	private String address;

	public Notice(Student student) {
		this.receiver = student.getName();
		this.address = student.getAddress();
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public Notice  clone(){
		Notice notice = null;

		try {
			notice = (Notice) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return notice;
	}
}
