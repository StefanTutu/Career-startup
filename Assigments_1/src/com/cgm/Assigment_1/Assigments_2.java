package com.cgm.Assigment_1;

import java.util.Arrays;
import java.util.Scanner;

public class Assigments_2 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Numarul de elemente pentru array: ");
		int count = keyboard.nextInt();
		int [] numbers = new int[count];
		keyboard.nextLine(); // pauza pentru a lua sirul de caractere
		System.out.println("Sirul de caractere pentru array: ");
        @SuppressWarnings("resource")
		Scanner numScanner = new Scanner(keyboard.nextLine());
        for (int i = 0; i < count; i++) {
            if (numScanner.hasNextInt()) {
                numbers[i] = numScanner.nextInt();
            } else {
                System.out.println("Nu sunt suficiente valori");
                break;
            }
        }
        
        System.out.println(Arrays.toString(numbers));

        System.out.print("Numarul de randuri pentru matrice: ");
        int rows = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("Numarul de coloane pentru matrice: ");
        int columns = keyboard.nextInt();
        keyboard.nextLine();
        int[][] a = new int[rows][columns];
        System.out.println("Introduceti valorile matricei: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                a[i][j] = keyboard.nextInt();
                
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
