package com.lrh.bridge.notify;

/**
 * @description:
 * @author: lrh
 * @date: 2020/7/4 15:39
 */
public class WarnNotify extends AbstractNotify {

	private static final String WARN = "WARN";

	public WarnNotify(MessageSend messageSend, MessageFormat messageFormat) {
		super(messageSend, messageFormat);
	}

	@Override
	protected void setEventLevel() {
		super.eventLevel = WARN;
	}
}
