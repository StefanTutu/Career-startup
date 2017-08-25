package com.cgm.Assigment_1;

import java.util.Random;
import java.util.Scanner;

public class Assigments_3 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Numarul de randuri pentru matrice ");
        int rows = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("Numarul de coloane pentru matrice ");
        int columns = keyboard.nextInt();
        keyboard.nextLine();
        int[][] a = new int[rows][columns];
        
        Random r = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                a[i][j] =r.nextInt(100)+1;
                
            }
        }
        System.out.println("Valorile matricei sunt: ");
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
            	System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
	}

}
