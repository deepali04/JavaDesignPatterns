package com.behavioural.command;

//This will act as a Client
public class TestClass {
	
	public static void main(String[] args) {
		
		Options options = new Options();
		File file =new File();
		
		CommandInterface openFile = new Open(file);
		CommandInterface saveFile = new Save(file);
		
		//Open
		options.setCommand(openFile);
		options.click();
		
		//Save
		options.setCommand(saveFile);
		options.click();
		
		
		
	}
}

