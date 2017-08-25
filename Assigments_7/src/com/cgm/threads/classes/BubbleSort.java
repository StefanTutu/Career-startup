package com.cgm.threads.classes;

import java.util.Arrays;
import java.util.concurrent.Callable;

public class BubbleSort implements Callable<Integer> {

	private int count = 0;

	public void bubbleSort(int[] arr) {

		Thread t1 = new Thread(new Runnable() {
			public void run() {
				System.out.println(" ");
				int n = arr.length;
				int temp = 0;
				for (int i = 0; i < n; i++) {
					for (int j = 1; j < (n - i); j++) {
						if (arr[j - 1] > arr[j]) {
							// swap elements
							temp = arr[j - 1];
							arr[j - 1] = arr[j];
							arr[j] = temp;
							add();
						}

					}
					System.out.println(Arrays.toString(arr));
				}
				

			}
		});

		t1.start();

		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		System.out.println(" ");
//		System.out.println(" ");
//		System.out.println("Count for bubble sort " + count);

	}

	public synchronized void add() {
		count++;
	}

	public synchronized void substract() {
		count--;
	}

	@Override
	public Integer call() throws Exception {
		return count;
	}

}
