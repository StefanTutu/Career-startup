package com.cgm.threads.main;

import java.util.Random;
import java.util.Scanner;

public class SearchThreads extends Thread {

	private int count = 0;

	public static void main(String[] args) {

		int[] anArray;
		anArray = new int[100];

		Random generator = new Random();

		for (int i = 0; i < 100; i++) {
			anArray[i] = (generator.nextInt(100) + 1);

			System.out.print(anArray[i] + " ");
		}
		System.out.println(" ");

		SearchThreads sd = new SearchThreads();
		sd.search(anArray);
	}

	public void search(int array[]) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Value for search");
		int valueForSearch = input.nextInt();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 25; i++) {
					if (array[i] == valueForSearch) {
						add();
						System.out.println("Thread 1");
					}
					;

				}

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 25; i < 50; i++) {
					if (array[i] == valueForSearch) {
						add();
						System.out.println("Thread 2");
					}
					;
				}
			}
		});

		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 50; i < 75; i++) {
					if (array[i] == valueForSearch) {
						add();
						System.out.println("Thread 3");
					}
					;
				}
			}
		});

		Thread t4 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 75; i < 100; i++) {
					if (array[i] == valueForSearch) {
						add();
						System.out.println("Thread 4");
					}
					;
				}
			}
		});

		t1.start();// Start first thread
		t2.start();// While first thread is running, start second.
		t3.start();// While other thread is running, start three.
		t4.start();// While other thread is running, start for.
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Value was found of " + count + " time.");

	}

	public synchronized void add() {
		count++;
	}

	public synchronized void substract() {
		count--;
	}

}
