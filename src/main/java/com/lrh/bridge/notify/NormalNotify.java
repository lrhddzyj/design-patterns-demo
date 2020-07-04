package com.lrh.bridge.notify;

/**
 * @description:
 * @author: lrh
 * @date: 2020/7/4 15:37
 */
public class NormalNotify extends AbstractNotify {

	private static final String NORMAL = "NORMAL";

	public NormalNotify(MessageSend messageSend, MessageFormat messageFormat) {
		super(messageSend, messageFormat);
	}

	@Override
	protected void setEventLevel() {
		super.eventLevel = NORMAL;
	}
}
