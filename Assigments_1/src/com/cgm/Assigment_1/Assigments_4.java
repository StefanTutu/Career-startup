package com.cgm.Assigment_1;

import java.util.Scanner;

public class Assigments_4 {

	public static void main(String[] args) {
		
		   @SuppressWarnings("resource")
		   Scanner keyboard = new Scanner(System.in);
	       System.out.print("Numarul de randuri ale matricilor: ");
	       int rows =  keyboard.nextInt();
	       System.out.print("Numarul de coloane ale matricilor: ");
	       int columns = keyboard.nextInt();
	       int[][] a = new int[rows][columns];
	       int[][] b = new int[rows][columns];
	       System.out.println("Introduceti prima matrice:");
	       for (int i = 0; i < rows; i++) {
	           for (int j = 0; j < columns; j++) {
	               a[i][j] = keyboard.nextInt();
	           }
	       }
	       System.out.println("Introduceti a doua matrice:");
	       for (int i = 0; i < rows; i++) {
	           for (int j = 0; j < columns; j++) {
	               b[i][j] = keyboard.nextInt();
	           }
	       }
	       int[][] c = new int[rows][columns];
	       for (int i = 0; i < rows; i++) {
	           for (int j = 0; j < columns; j++) {
	               c[i][j] = a[i][j] + b[i][j];
	           }
	       }
	       System.out.println("Suma celor 2 matrici este: ");
	       for (int i = 0; i < rows; i++) {
	           for (int j = 0; j < columns; j++) {
	               System.out.print(c[i][j] + " ");
	           }
	           System.out.println();
	       }
	       System.out.println("Numarul scalar pentru a fi inmultita prima matrice");
	       int x;
	       x=keyboard.nextInt();
	       int[][] d = new int[rows][columns];
	       for(int i = 0; i < rows; i++) {
	    	   for(int j = 0; j < columns;j++) {
	    		   d[i][j] = x*a[i][j];
	    	   }
	       }
	       
	       for (int i = 0; i < rows; i++) {
	           for (int j = 0; j < columns; j++) {
	               System.out.print(d[i][j] + " ");
	           }
	           System.out.println();
	       }
	       System.out.println("Inmultirea matricelor rezulta:");
	       
	       if (a[0].length!= b.length) { //coloana = rand
	            throw new IllegalArgumentException("Coloanele matricelor A: " + 
	            		a[0].length + " Nu se potrivesc cu coloanele matricei B " + b.length + ".");
	        }
	       
	       int[][] e = new int [a.length][b[0].length];
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                e[i][j] = 0;
	            }
	        }
	        
	       for(int i = 0; i < a.length; i++) { //radul lui a
	    	   for(int j = 0; j < b[0].length;j++) { // coloana lui b
	    		   for (int k = 0; k < a[0].length; k++) { //coloana lui a
	                    e[i][j] += a[i][k] * b[k][j];
	                }
	    	   }
	       }
	       
	       
	       for (int i = 0; i < rows; i++) {
	           for (int j = 0; j < columns; j++) {
	               System.out.print(e[i][j] + " ");
	           }
	           System.out.println();
	       }

	}

}
