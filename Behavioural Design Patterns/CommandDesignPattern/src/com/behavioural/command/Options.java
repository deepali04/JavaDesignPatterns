package com.behavioural.command;

//This will act as a Invoker
public class Options {
	private CommandInterface ci;
	
	public void setCommand(CommandInterface ci) {
		this.ci=ci;
	}
	
	public void click() {
		ci.execute();
	}
	
}
