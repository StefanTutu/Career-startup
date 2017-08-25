package com.cgm.Assigment_1;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter value for m: ");
		int m = scan.nextInt();
		System.out.println("Enter value for n: ");
		int n = scan.nextInt();
		
		int matrix1[][] = new int[m][n];
		int matrix2[][] = new int[m][n];
				
		System.out.println("Enter the matrix1 elements");
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				matrix1[i][j] = scan.nextInt();
			}
		}
				
		System.out.println("Enter value for p: ");
		int p = scan.nextInt();
		
		int matrix3[][] = new int[n][p];
		
		int multiplication[][] = new int[m][p];		
		
		System.out.println("Enter the matrix3 elements");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < p; j++) {
				matrix3[i][j] = scan.nextInt();
			}
		}
				
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < p; j++) {
				int sum = 0;
				for(int k = 0; k < n; k++) {
					sum = sum + matrix1[i][k] * matrix3[k][j];					
				}
				multiplication[i][j] = sum;
			}
		}
		
		System.out.println("Matrix1 and Matrix3 multiplication");
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < p; j++) {
				System.out.print(multiplication[i][j] + " ");				
			}
			System.out.println();
		}
		

		
	}

}
