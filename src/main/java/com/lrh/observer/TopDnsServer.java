package com.lrh.observer;

/**
 * @description:
 * @author: lrh
 * @date: 2020/5/15 14:22
 */
public class TopDnsServer extends AbstractDnsServer {

	private static final String TOP_DOMAIN_SUFFIX = ".com";

	private static final String TOP_OWNER_NAME = "顶级DNS服务器";

	@Override
	protected boolean isLocal(Recorder recorder) {
		return recorder.getDomain().endsWith(TOP_DOMAIN_SUFFIX);
	}

	@Override
	protected void sign(Recorder recorder) {
		recorder.setOwner(TOP_OWNER_NAME);
	}
}
