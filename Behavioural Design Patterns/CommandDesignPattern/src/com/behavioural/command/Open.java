package com.behavioural.command;

//It will act as  a concrete command
public class Open implements CommandInterface {
	
	//reference to the file
	private File file;
	
	public Open(File file) {
		// TODO Auto-generated constructor stub
		this.file=file;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		file.open();
		
	}
	

}
