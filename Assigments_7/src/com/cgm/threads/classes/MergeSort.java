package com.cgm.threads.classes;

import java.util.Arrays;
import java.util.concurrent.Callable;

public class MergeSort implements Callable<Integer> {

	private int[] array;
	private int[] tempMergArr;
	private int length;
	private int count;

	public void sort(int inputArr[]) {
		this.array = inputArr;
		this.length = inputArr.length;
		this.tempMergArr = new int[length];
		doMergeSort(0, length - 1);
		
	}

	private void doMergeSort(int lowerIndex, int higherIndex) {

		if (lowerIndex < higherIndex) {
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			// Below step sorts the left side of the array
			doMergeSort(lowerIndex, middle);
			// Below step sorts the right side of the array
			doMergeSort(middle + 1, higherIndex);
			// Now merge both sides
			mergeParts(lowerIndex, middle, higherIndex);
		}
	}

	private void mergeParts(int lowerIndex, int middle, int higherIndex) {

		for (int i = lowerIndex; i <= higherIndex; i++) {
			tempMergArr[i] = array[i];
		}
		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;
		while (i <= middle && j <= higherIndex) {
			if (tempMergArr[i] <= tempMergArr[j]) {
				array[k] = tempMergArr[i];
				i++;
			} else {
				array[k] = tempMergArr[j];
				j++;
			}
			k++;
			add();
			System.out.println(Arrays.toString(tempMergArr));
			
		}
		while (i <= middle) {
			array[k] = tempMergArr[i];
			k++;
			i++;
			add();
			System.out.println(Arrays.toString(tempMergArr));
		}

	}

	private void add() {
		count++;
	}

	@Override
	public Integer call() throws Exception {
		return count;
	}

}
