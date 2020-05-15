package com.lrh.observer;

/**
 * @description:
 * @author: lrh
 * @date: 2020/5/15 13:57
 */
public class Recorder {

	private String domain;

	private String ip;

	private String owner;


	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Recorder{" +
				"domain='" + domain + '\'' +
				", ip='" + ip + '\'' +
				", owner='" + owner + '\'' +
				'}';
	}
}
