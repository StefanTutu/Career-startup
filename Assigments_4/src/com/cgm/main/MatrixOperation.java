package com.cgm.main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class MatrixOperation {
	
	private static final String FileResult = "C:\\Users\\stefan.tutu\\Downloads\\Result.txt";
	private static final String FileResultA = "C:\\Users\\stefan.tutu\\Downloads\\ResultAddition.txt";

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter value for column of matrix 1: ");
		int column = scan.nextInt();
		System.out.println("Enter value for row of matrix 1: ");
		int row = scan.nextInt();
		
		int matrix1[][] = new int[column][row];
				
		System.out.println("Enter the matrix1 elements");
		
		for(int countColumn = 0; countColumn < column; countColumn++) {
			for(int countRow = 0; countRow  < row; countRow ++) {
				matrix1[countRow][countRow ] = scan.nextInt();
			}
		}
				
				
		System.out.println("Enter value for row for matrix 2: ");
		int row2 = scan.nextInt();
		
		int matrix2[][] = new int[row][row2];
		
		int multiplication[][] = new int[column][row2];		
		
		System.out.println("Enter the matrix2 elements");
		for(int countColumn = 0; countColumn < row; countColumn++) {
			for(int countRow = 0; countRow < row2; countRow++) {
				matrix2[countColumn][countRow] = scan.nextInt();
			}
		}
				
		for(int countColumn = 0; countColumn < column; countColumn++) {
			for(int countRow = 0; countRow < row2; countRow++) {
				int sum = 0;
				for(int count = 0; count < row; count++) {
					sum = sum + matrix1[countColumn][count] * matrix2[count][countRow];					
				}
				multiplication[countColumn][countRow] = sum;
			}
		}
		
		System.out.println("Matrix1 and Matrix2 multiplication");
		for(int countColumn = 0; countColumn < column; countColumn++) {
			for(int countRow = 0; countRow < row2; countRow++) {
				System.out.print(multiplication[countColumn][countRow] + " ");				
			}
			System.out.println();
		}
		
	    int[][] MatrixAddition = new int[column][row];
	       for(int countColumn = 0; countColumn < column; countColumn++) {
	    	   for(int countRow = 0; countRow < row;countRow++) {
	    		   MatrixAddition[countColumn][countRow] = matrix1[countColumn][countRow]+matrix2[countColumn][countRow];
	    	   }
	       }
	       
	       System.out.println("Matrix 1 and matrix 2 addition:");
	       for(int countColumn = 0; countColumn < column; countColumn++) {
	    	   for(int countRow = 0; countRow < row;countRow++) {
	               System.out.print(MatrixAddition[countColumn][countRow] + " ");
	           }
	           System.out.println();
	       }
		
		try {
			
			FileWriter filewriter = null;
        	BufferedWriter bufferwriter = null;
        	filewriter = new FileWriter(FileResult,true);
        	bufferwriter = new BufferedWriter(filewriter);

        	StringBuilder builder = new StringBuilder();
        	
       
        	bufferwriter.newLine();
            for (int countRows = 0; countRows < multiplication.length; countRows++) 
            { // for each row
            	for (int countColumns = 0; countColumns < multiplication[countRows].length; countColumns++) 
            	{ // for each column
            		builder.append(multiplication[countRows][countColumns]+""); // append to the output string
            		
            		if(countColumns < multiplication.length - 1) {//if this is not the last row element
            			builder.append(",");
            		}
                } 
            	builder.append("\r\n"); // append new line at the end of the rows
                
            }
            
           
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\stefan.tutu\\Downloads\\Result"+".txt", true));
            writer.write(builder.toString());//save the string representation
            writer.write("--------------------------------");
            builder.append("\r\n");
            writer.close();
            bufferwriter.newLine();
            bufferwriter.flush();
            bufferwriter.close();
            
		} catch (Exception e) {
			
			System.out.println("Error");
		}
		
		try {
			
			FileWriter filewriterA = null;
        	BufferedWriter bufferwriteA = null;
        	filewriterA = new FileWriter(FileResultA,true);
        	bufferwriteA= new BufferedWriter(filewriterA);

        	StringBuilder builderA = new StringBuilder();
        	
       
        	bufferwriteA.newLine();
            for (int countRows = 0; countRows < MatrixAddition.length; countRows++) 
            { // for each row
            	for (int countColumns = 0; countColumns < MatrixAddition[countRows].length; countColumns++) 
            	{ // for each column
            		builderA.append(MatrixAddition[countRows][countColumns]+""); // append to the output string
            		
            		if(countColumns < MatrixAddition.length - 1) {//if this is not the last row element
            			builderA.append(",");
            		}
                } 
            	builderA.append("\r\n"); // append new line ar the end of the rows
                
            }
            
           
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\stefan.tutu\\Downloads\\ResultAddition"+".txt", true));
            writer.write(builderA.toString());//save the string representation
            writer.write("--------------------------------");
            builderA.append("\r\n");
            writer.close();
            bufferwriteA.newLine();
            bufferwriteA.flush();
            bufferwriteA.close();
		} catch (Exception e) {
			
			System.out.println("Error");
		}

	}

}
