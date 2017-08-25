package com.cgm.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class GenerateTwoMatrix {
	
	private static final String FileMatrix1 = "C:\\Users\\stefan.tutu\\Downloads\\Matrix1.txt";
	private static final String FileMatrix2 = "C:\\Users\\stefan.tutu\\Downloads\\Matrix2.txt";

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Number of rows for matrix: ");
        int rows = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("Number of columns for matrix: ");
        int columns = keyboard.nextInt();
        keyboard.nextLine();
        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];
        
        Random random = new Random();
        for (int countRows = 0; countRows < rows; countRows++) {
            for (int countColumns = 0; countColumns < columns; countColumns++) {
                matrix1[countRows][countColumns] =random.nextInt(100)+1;
            }
        }
        
        for (int countRows = 0; countRows < rows; countRows++) {
            for (int countColumns = 0; countColumns < columns; countColumns++) {
                matrix2[countRows][countColumns] =random.nextInt(100)+1;
                
            }
        }
        
        
        try {
        	FileWriter filewriter1 = null;
        	BufferedWriter bufferwriter1 = null;
        	filewriter1 = new FileWriter(FileMatrix1);
        	bufferwriter1 = new BufferedWriter(filewriter1);
        	
        	StringBuilder builder1 = new StringBuilder();
        	
       
            for (int countRows = 0; countRows < matrix1.length; countRows++) 
            { // for each row
            	for (int countColumns = 0; countColumns < matrix1[countRows].length; countColumns++) 
            	{ // for each column
            		builder1.append(matrix1[countRows][countColumns]+""); // append to the output string
            		
            		if(countColumns < matrix1.length - 1) {//if this is not the last row element
            			builder1.append(",");
            		}
                } 
            	builder1.append("\r\n"); // append new line ar the end of the rows
                
            }
            
           
            BufferedWriter writer1 = new BufferedWriter(new FileWriter("C:\\Users\\stefan.tutu\\Downloads\\Matrix1"+".txt"));
            writer1.write(builder1.toString());//save the string representation
            writer1.close();
            bufferwriter1.flush();
            
            
            FileWriter filewriter2 = null;
        	BufferedWriter bufferwriter2 = null;
        	filewriter2 = new FileWriter(FileMatrix2);
        	bufferwriter2 = new BufferedWriter(filewriter2);
        	
        	StringBuilder builder2 = new StringBuilder();
        	
       
            for (int countRows = 0; countRows < matrix2.length; countRows++) 
            { // for each row
            	for (int countColumns = 0; countColumns < matrix2[countRows].length; countColumns++) 
            	{ // for each column
            		builder2.append(matrix2[countRows][countColumns]+""); // append to the output string
            		
            		if(countColumns < matrix2.length - 1) {//if this is not the last row element
            			builder2.append(",");
            		}
                } 
            	builder2.append("\r\n"); // append new line ar the end of the rows
                
            }
            
           
            BufferedWriter writer2 = new BufferedWriter(new FileWriter("C:\\Users\\stefan.tutu\\Downloads\\Matrix2"+".txt"));
            writer2.write(builder2.toString());//save the string representation
            writer2.close();
            bufferwriter2.flush();
        }
        catch (IOException e){
        	
        	System.out.println("Error");
        	
        }
        
        
//        System.out.println("Valorile matricei sunt: ");
//        
//        for (int countRows = 0; countRows < rows; countRows++) {
//            for (int countColumns = 0; countColumns < columns; countColumns++) {
//            	System.out.print(matrix1[countRows][countColumns]  + " ");
//            }
//            System.out.println();
//        }
//        
//        System.out.println("");
//        for (int countRows = 0; countRows < rows; countRows++) {
//            for (int countColumns = 0; countColumns < columns; countColumns++) {
//            	System.out.print(matrix2[countRows][countColumns]  + " ");
//            }
//            System.out.println();
//        }

	}

}
