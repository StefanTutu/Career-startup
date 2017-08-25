package com.cgm.main;

import java.io.File;

import java.util.Scanner;

import com.cgm.classes.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void multiply(File input_file1, File input_file2, File      output_file){
			    
		try{
			
			Scanner firstScan = new Scanner(input_file1);
	        Scanner secondScan = new Scanner(input_file2);
	        PrintWriter writer = new PrintWriter(output_file);

	        int[][] matrixOne = new int[][] {};
	        int[][] matrixTwo = new int[][] {};

	        firstScan.nextLine();
	        secondScan.nextLine();
	        while (firstScan.hasNext()) {
	            for (int row = 0; row < input_file1.length(); row++) {
	                for (int col = 0; col < input_file1.length(); col++) {
	                    matrixOne[row][col] = firstScan.nextInt();
	                }
	            }
	        }
	        while (secondScan.hasNext()) {
	            for (int row = 0; row < input_file2.length(); row++) {
	                for (int col = 0; col < input_file2.length(); col++) {
	                    matrixTwo[row][col] = secondScan.nextInt();
	                }
	            }
	        }
	        int [][] result = new int[][] {};
	        writer.println(result);
	    } 
		catch (FileNotFoundException e) 
		{
	        return;
	    }
		
		
		
		
		
		FileReaders fileReaders = new FileReaders();
		FileWriters fileWriters = new FileWriters();
		showLine();
		fileWriters.writeFile();
		fileReaders.readFile();
		
		fileWriters.writeFileString();
		fileReaders.readFileJ8String();
		
		fileReaders.readFileJ8String();
		
		FileFeatures fileFeatures = new FileFeatures();
		showLine();
		File currentDir = new File(".");
		fileFeatures.showFiles(currentDir);
		
		// showing throws functionality
		try {
			showLine();
			fileFeatures.showFilesJ8();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	 
	// helper method
	private static void showLine(){
		System.out.println("=========================================================");
	}
		

}

