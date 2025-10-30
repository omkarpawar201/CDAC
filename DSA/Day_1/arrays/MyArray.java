package com.demo.arrays;

import java.util.Arrays;

public class MyArray {
	private int[] arr;
	private int count;

	public MyArray() {
		this.arr = new int[10];
		count = 0;
	}

	public MyArray(int[] arr, int count) {
		this.arr = arr;
		this.count = count;
	}

	public MyArray(int size) {
		this.arr = new int[size];
		count = 0;
	}

	public int getCapacity() {
		return arr.length;
	}

	public int getSize() {
		return count;
	}

	public boolean add(int num) {
		if (count < arr.length) {
			arr[count] = num;
			count++;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "MyArray [arr=" + Arrays.toString(arr) + "]";
	}

	public boolean addAtPos(int num, int pos) {
		if (count < arr.length) {

			for (int i = count; i > pos; i--) {
				arr[i] = arr[i - 1];
			}

			arr[pos] = num;
			count++;
			return true;
		}
		return false;
	}

	public int search(int num) {
		for (int i = 0; i < count; i++) {
			if (arr[i] == num) {
				return i;
			}
		}
		return -1;
	}

	public boolean deleteByIndex(int index) {
		if (index < count) {
			for (int i = index; i < count; i++) {
				arr[i] = arr[i + 1];
			}
			count--;
			return true;
		}
		return false;
	}

	public boolean deleteByValue(int num) {
		int index = search(num);

		if (index != -1) {
			return deleteByIndex(index);
		}

		return false;
	}

	public int[] rotateArray(int num, boolean b) {
		if (b) {
			for (int i = 0; i < num; i++) {
				int temp = arr[count - 1];
				for (int j = count - 1; j > 0; j--) {
					arr[j] = arr[j - 1];
				}
				arr[0] = temp;
			}
			return arr;
		} else {
			for (int i = 0; i < num; i++) {
				int temp = arr[0];
				for (int j = 0; j < count - 1; j++) {
					arr[j] = arr[j + 1];
				}
				arr[count - 1] = temp;
			}
			return arr;
		}

	}

	public int[] reverseArray(boolean b) {

		int j = count - 1;

		if (b) {
			for (int i = 0; i < count - 1; i++) {
				if (i < j) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					j--;
				}
			}
			return arr;
		} else {
			int[] rev = new int[count];
			int j1 = 0;
			for (int i = count - 1; i >= 0; i--) {
				rev[j1] = arr[i];
				j1++;
			}
			return rev;
		}
	}

	public int[] exchangeIndexValue() {

		int max = arr[0];

		for (int i = 0; i < count; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		int[] arr1 = new int[max + 1];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = -1;
		}

		for (int i = 0; i < count; i++) {
			int idx = arr[i];
			int value = i;
			arr1[idx] = value;
		}
		return arr1;
	}

	public int sumOfAll() {
		int sum = 0;

		for (int i = 0; i < count; i++) {
			sum += arr[i];
		}
		return sum;
	}

}
