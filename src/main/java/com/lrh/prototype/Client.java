package com.lrh.prototype;


import java.util.Random;

public class Client {

	private static int MAX_COUNT = 10;

	public static void main(String[] args) {

		int i = 0;
		Notice noticePrototype = new Notice(new Student());
		noticePrototype.setSubject("入学通知书");
		noticePrototype.setMsg("我们将于九月一日开学");

		while (i < MAX_COUNT){
			Notice notice = noticePrototype.clone();
			notice.setAddress(getRandString(20));
			notice.setReceiver(getRandString(5) +" 同学");
			sendNotice(notice);
			i++;
		}
	}

	private  static  void sendNotice(Notice notice){
		System.out.println("发送通知书给 " + notice.getReceiver());
		System.out.println("  address = [" + notice.getAddress() + "]");
	}


	public static String getRandString(int length){
		String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		Random random=new Random();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<length;i++){
			int number=random.nextInt(62);
			sb.append(str.charAt(number));
		}

		return sb.toString();
	}
}
