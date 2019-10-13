package com.lrh.templateMethod;

public class Test {

	public static void main(String[] args) {
		ACommand a = new ACommand();

		BCommand b = new BCommand();

		a.executeRun();

		b.executeRun();

	}
}
