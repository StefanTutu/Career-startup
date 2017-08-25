package com.cgm.threads.classes;

public class BubbleSortThread extends Thread {

	private int count = 0;

	public void bubbleSort(int[] arr) {

		Thread t1 = new Thread(new Runnable() {
			public void run() {

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
				}

			}
		});

		t1.start();

		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Count for bubble sort " + count);

	}

	public synchronized void add() {
		count++;
	}

	public synchronized void substract() {
		count--;
	}

}
