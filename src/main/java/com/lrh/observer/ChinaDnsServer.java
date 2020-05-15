package com.lrh.observer;

/**
 * @description:
 * @author: lrh
 * @date: 2020/5/15 14:20
 */
public class ChinaDnsServer extends AbstractDnsServer {

	private static final String CN_DOMAIN_SUFFIX = ".cn";

	private static final String CN_OWNER_NAME = "中国DNS服务器";

	@Override
	protected boolean isLocal(Recorder recorder) {
		return recorder.getDomain().endsWith(CN_DOMAIN_SUFFIX);
	}

	@Override
	protected void sign(Recorder recorder) {
		recorder.setOwner(CN_OWNER_NAME);
	}

}
