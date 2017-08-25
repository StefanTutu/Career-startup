package com.cgm.Assigment_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Assigments_5 {

	public static void main(String[] args) {
		
		Random r = new Random();
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		int [] array;
		array = new int[100];
		boolean found=false;
		int search,i;
		System.out.println("Valoarea cautat in sir: ");
		search=keyboard.nextInt();
		for (i = 0; i < array.length; i++) {
	                array[i] =r.nextInt(100)+1;
	        }
		for (i = 0; i < array.length; i++) {
            if (array[i] == search) {
                found = true;
                break;
            }
        }
		
		if(found==true) {
			System.out.println("sa gasit numarul "+search+" la indexul "+i);
		}else {
			System.out.println(search+" nu se afla in array !");
		}
		System.out.println("");
		System.out.println("Arrayul este urmatorul: ");
		System.out.println(Arrays.toString(array));
				
	}

}
