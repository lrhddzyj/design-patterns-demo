package com.lrh.factory;

/**
 * @author lrh
 */
public abstract class AbstractHumanFactory {

	public abstract Human createHuman(Class<? extends Human> c);

}
