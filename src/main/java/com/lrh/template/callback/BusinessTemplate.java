package com.lrh.template.callback;

/**
 * @description:
 * @author: lrh
 * @date: 2020/12/3 20:49
 */
public class BusinessTemplate {

	public void processBusiness(Callback callback) {
		System.out.println("处理业务。。。。");
		sleep(1);
		System.out.println("3。。。。");
		sleep(1);
		System.out.println("2。。。。");
		sleep(1);
		System.out.println("1。。。。");
		System.out.println("完成，发起回调。。。。");
		CallbackVo callbackVo = new CallbackVo();
		callbackVo.setCallbackId("11");
		callbackVo.setCallbackName("1234");
		callback.callback(callbackVo);
		System.out.println("发起完成。。。。");
	}

	private static void sleep(long second) {
		try {
			Thread.sleep(second * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
