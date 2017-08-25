package com.cgm.classes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFileInt {
	
	
	
	public void readFileIntMatrix1() {
		try {
			String content = new String(Files.readAllBytes(Paths.get("C:\\Users\\stefan.tutu\\Downloads\\Matrix1.txt")));
			
			String [] rows = content.split("\r\n");
			int [][] matrix = new int[rows.length][];
			
			for (int row = 0; row < matrix.length; row++) {
			    String[] columns = rows[row].split(",");
			    matrix[row] = new int[columns.length];
			    for (int column = 0; column < matrix[row].length; column++) {
			        matrix[row][column] = Integer.parseInt(columns[column]);
			    }
			}
			
			for (int row = 0; row < matrix.length; row++) {
		           for (int column = 0; column < matrix[row].length; column++) {
		               System.out.print(matrix[row][column] + " ");
		           }
		           System.out.println();
		       }
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		public void readFileIntMatrix2() {
		try {
			String content = new String(Files.readAllBytes(Paths.get("C:\\Users\\stefan.tutu\\Downloads\\Matrix2.txt")));
			//System.out.println(content);
			
			System.out.println("");
			
			String [] rows = content.split("\r\n");
			int [][] matrix = new int[rows.length][];
			
			for (int row = 0; row < matrix.length; row++) {
			    String[] columns = rows[row].split(",");
			    matrix[row] = new int[columns.length];
			    for (int column = 0; column < matrix[row].length; column++) {
			        matrix[row][column] = Integer.parseInt(columns[column]);
			    }
			}
			
			for (int row = 0; row < matrix.length; row++) {
		           for (int column = 0; column < matrix[row].length; column++) {
		               System.out.print(matrix[row][column] + " ");
		           }
		           System.out.println();
		       }
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
