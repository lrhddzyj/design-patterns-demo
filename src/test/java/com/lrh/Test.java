package com.lrh;

import com.lrh.templateMethod.ACommand;
import com.lrh.templateMethod.BCommand;

public class Test {
	public static void main(String[] args) {
		ACommand a = new ACommand();

		BCommand b = new BCommand();

		a.executeRun();
		b.executeRun();
	}
}
