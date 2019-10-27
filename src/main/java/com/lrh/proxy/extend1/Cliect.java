package com.lrh.proxy.extend1;

public class Cliect {

	public static void main(String[] args) throws Exception {
		Subject subject = new SubjectProxy("张三");
		subject.play();
	}
}
