package com.lrh.templateMethod;

public abstract class AbstractCommand {

	/**
	 * HOOK METHOD
	 * @return
	 */
	protected abstract  boolean pre() ;

	protected abstract  void after() ;

	protected abstract void run();

	public final void executeRun(){
		if(pre()){
			run();
			after();
		}
	}

}
