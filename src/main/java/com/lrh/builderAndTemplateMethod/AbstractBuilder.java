package com.lrh.builderAndTemplateMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractBuilder {

	private List<String> methodList = new ArrayList();

	/**
	 * 建造方法(模板方法)
	 * 按照定制的执行顺序执行方法
	 *
	 * @return
	 */
	protected abstract Product build();

	/**
	 * 基本方法
	 */
	protected  void methodA(){

	}
	/**
	 * 基本方法
	 */
	protected  void methodB(){

	}
	/**
	 * 基本方法
	 */
	protected  void methodC(){

	}


	/**
	 * 设置建造的内部逻辑（配置零件）
	 */
	public abstract void setPart();

}
