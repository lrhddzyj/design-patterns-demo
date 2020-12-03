package com.lrh.template.callback;

/**
 * @description:
 * @author: lrh
 * @date: 2020/12/3 20:53
 */
public class Client {

	public static void main(String[] args) {

		BusinessTemplate businessTemplate = new BusinessTemplate();
		businessTemplate.processBusiness(vo -> {
			System.out.println("执行回调！！！");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("回调执行完成。。。。。。。。。。。");
		});

	}
}
