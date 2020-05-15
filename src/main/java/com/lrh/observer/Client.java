package com.lrh.observer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Observable;

/**
 * @description:
 * @author: lrh
 * @date: 2020/5/15 14:23
 */
public class Client extends Observable {

	public static void main(String[] args) throws IOException {
		Client client = new Client();
		AbstractDnsServer sh = new SHDnsServer();
		AbstractDnsServer cn = new ChinaDnsServer();
		AbstractDnsServer top = new TopDnsServer();
		cn.setUpperServer(top);
		sh.setUpperServer(cn);
		client.addObserver(sh);

		System.out.printf("====域名解析模拟器====");
		while (true) {
			System.out.println("\n请输入域名（输入N退出）");
			String domain = (new BufferedReader(new InputStreamReader(System.in))).readLine();
			if (domain.equalsIgnoreCase("n")) {
				return;
			}
			Recorder recorder = new Recorder();
			recorder.setDomain(domain);
			client.setChanged();
			client.notifyObservers(recorder);
//			sh.update(null, recorder);
			System.out.println("-----DNS服务器解析结果------");
			System.out.println(recorder);
		}

	}




}
