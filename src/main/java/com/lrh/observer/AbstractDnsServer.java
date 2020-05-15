package com.lrh.observer;

import java.util.Observable;
import java.util.Observer;
import java.util.Random;

/**
 * @description:
 * @author: lrh
 * @date: 2020/5/15 13:55
 */
public abstract class AbstractDnsServer extends Observable implements Observer {
	@Override
	public void update(Observable o, Object arg) {
		Recorder recorder = (Recorder) arg;

		if(this.isLocal(recorder)){
			recorder.setIp(this.genIpAddress());
			this.sign(recorder);
		}else{
			this.responseFromUpperServer(recorder);
		}

	}

	//只允许有一个父级观察者
	public void setUpperServer(AbstractDnsServer dnsServer) {
		super.deleteObservers();
		super.addObserver(dnsServer);
	}

	private void responseFromUpperServer(Recorder recorder) {
		super.setChanged();
		super.notifyObservers(recorder);
	}



	/**
	 * 每个DNS服务器定义的自己能处理的级别
	 *
	 * @param recorder
	 * @return
	 */
	protected abstract boolean isLocal(Recorder recorder);

	/**
	 * 每个DNS服务器签上自己的名字
	 *
	 * @param recorder
	 */
	protected abstract void sign(Recorder recorder);

	private String genIpAddress() {
		Random random = new Random();
		String address = random.nextInt(255) + "." +
				random.nextInt(255) + "." +
				random.nextInt(255) + "." +
				random.nextInt(255);
		return address;
	}


}
