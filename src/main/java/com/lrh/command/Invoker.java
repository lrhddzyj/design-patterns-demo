package com.lrh.command;

public class Invoker {

	private AbstractCommand command;

	public void setCommand(AbstractCommand command){
		this.command = command;
	}

	public void action(){
		this.command.execute();
	}
}
