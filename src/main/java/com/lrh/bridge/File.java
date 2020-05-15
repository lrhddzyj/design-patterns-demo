package com.lrh.bridge;

/**
 * @description:
 * @author: lrh
 * @date: 2020/5/15 15:24
 */
public interface File {

	/**
	 * 文件类型
	 *
	 * @return
	 */

	String getFileType();


	String getFileName();

	/**
	 * 文件内容
	 * @return
	 */
	String getFileContent();


}
