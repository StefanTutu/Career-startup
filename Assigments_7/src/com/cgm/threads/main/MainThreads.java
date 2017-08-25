package com.cgm.threads.main;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import com.cgm.threads.classes.BubbleSort;
import com.cgm.threads.classes.MergeSort;
import com.cgm.threads.classes.QuickSort;

public class MainThreads {


	public static void main(String[] args) {

		int[] anArray;
		anArray = new int[100];
		Random generator = new Random();

		for (int i = 0; i < 100; i++) {
			anArray[i] = (generator.nextInt(98) + 1);

			System.out.print(anArray[i] + " ");
		}
		System.out.println(" ");
		System.out.println(" ");


		int[] anArrayB = Arrays.copyOf(anArray, anArray.length);
		int[] anArrayM = Arrays.copyOf(anArray, anArray.length);

		QuickSort quick = new QuickSort();
		quick.sort(anArray);
		System.out.println(" ");
		System.out.println("Array After quick Sort");
		for (int i : anArray) {
			System.out.print(i + " ");
		}


		MergeSort merge = new MergeSort();
		merge.sort(anArrayM);
		System.out.println(" ");
		System.out.println("\n Array After merge Sort");
		for (int i : anArrayM) {
			System.out.print(i + " ");
		}

		BubbleSort bubble = new BubbleSort();
		bubble.bubbleSort(anArrayB);
		//bubble.start();
		System.out.println(" ");
		System.out.println("\n Array After Bubble Sort");
		for (int i = 0; i < anArrayB.length; i++) {
			System.out.print(anArrayB[i] + " ");
		}
		

		ExecutorService executor = Executors.newCachedThreadPool();
		
		Future<Integer> futureMerge = executor.submit(merge);
		Future<Integer> futureQuick = executor.submit(quick);
		Future<Integer> futureBuble = executor.submit(bubble);
		
		executor.shutdown();
		System.out.println(" ");
		try {
			System.out.println("Result for Merge sort is "+ futureMerge.get());
			System.out.println("Result for Quick sort is "+ futureQuick.get());
			System.out.println("Result for Bubble sort is "+ futureBuble.get());
			
		} catch (InterruptedException e) { 
			e.printStackTrace();
		} catch (ExecutionException e) {
			System.out.println(e.getMessage());
		}

	}

}
