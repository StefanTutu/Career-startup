package com.cgm.Assigment_1;

public class Assigments_1 {

	public static void main(String[] args) {
		
		int count=0;
		int element = 5;
		int array[]= {1,1,2,3,4,4,5,5,6,7,8,7,4,5,6,7};
		for(int i=1;i<array.length;i++) 
		{
			if(element==array[i]) 
			{
				count++;
			}
		}
		System.out.println("Elementul cautat apare de "+count+" ori.");
	}

}
