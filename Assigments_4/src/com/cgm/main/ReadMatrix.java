package com.cgm.main;

import com.cgm.classes.ReadFile;

public class ReadMatrix {


	public static void main(String[] args) {
		
		ReadFile readFile = new ReadFile();
		
		showLine();
		readFile.readFile();
		readFile.readFileJ8String();
		showLine();
		
	
	}
	 
	// helper method
	private static void showLine(){
		System.out.println("=========================================================");
	}


}
