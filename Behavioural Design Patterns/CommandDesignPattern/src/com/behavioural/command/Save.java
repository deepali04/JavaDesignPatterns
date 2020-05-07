package com.behavioural.command;

//It will act as  a concrete command
public class Save implements CommandInterface {
	
	//reference to the file
	private File file;
	
	public Save(File file) {
		this.file=file;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		file.save();
	}
	

}
