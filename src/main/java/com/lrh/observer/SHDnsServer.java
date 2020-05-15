package com.lrh.observer;

/**
 * @description:
 * @author: lrh
 * @date: 2020/5/15 14:17
 */
public class SHDnsServer extends AbstractDnsServer {

	private static final String SH_DOMAIN_SUFFIX = ".sh.cn";

	private static final String SH_OWNER_NAME = "上海DNS服务器";

	@Override
	protected boolean isLocal(Recorder recorder) {
		return recorder.getDomain().endsWith(SH_DOMAIN_SUFFIX);
	}

	@Override
	protected void sign(Recorder recorder) {
		recorder.setOwner(SH_OWNER_NAME);
	}
}
