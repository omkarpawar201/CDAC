package com.demo.arrays;

import java.util.Iterator;
import java.util.Scanner;

public class MyArray {
	int[][] arr;

	public MyArray() {
		arr = new int[3][3];
	}

	public MyArray(int rows, int col) {
		arr = new int[rows][col];
	}

	public void acceptData() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the array Elements : ");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("Enter Element " + i + " , " + j + " : ");
				arr[i][j] = scanner.nextInt();
			}
		}

	}

	public void displayArray() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "   ");
			}
			System.out.println();
		}

	}

	public int[] rowWiseSum() {
		int[] sum = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			sum[i] = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum[i] += arr[i][j];
			}
		}

		return sum;
	}

	public int[] colWiseSum() {

		int[] sum = new int[arr[0].length];

		for (int j = 0; j < arr[0].length; j++) {
			sum[j] = 0;
			for (int i = 0; i < arr.length; i++) {

				sum[j] += arr[i][j];
			}
		}

		return sum;
	}

	public int[][] rowWiseRotation(boolean flag, int num) {

		if (flag) {
//			for (int i = 0; i < arr.length; i++) {
//				for (int j = 0; j < arr[i].length; j++) {
//					a = arr[i][j];
//					arr[i][j] = arr[i + 1][j];
//					arr[i + 1][j] = a;
//				}
//			}
			for (int k = 0; k < num; k++) {
				int[] temp = arr[0];
				for (int i = 0; i < arr.length - 1; i++) {
					arr[i] = arr[i + 1];
				}
				arr[arr.length - 1] = temp;
			}
		} else {
			for (int k = 0; k < num; k++) {

				int[] temp = arr[arr.length - 1];
				for (int i = arr.length - 1; i > 0; i--) {
					arr[i] = arr[i - 1];
				}
				arr[0] = temp;
			}
		}
		return arr;
	}

	public int[][] colWiseRotation(boolean flag, int num) {
		if (flag) {
			for (int k = 0; k < num; k++) {

				int[] temp = new int[arr.length];
				for (int i = 0; i < arr.length; i++) {
					temp[i] = arr[i][arr[0].length - 1];
				}

				for (int i = 0; i < arr.length; i++) {
					for (int j = arr[0].length - 2; j >= 0; j--) {
						arr[i][j + 1] = arr[i][j];
					}
				}

				for (int i = 0; i < arr.length; i++) {
					arr[i][0] = temp[i];
				}
			}

		} else {
			for (int k = 0; k < num; k++) {

				int[] temp = new int[arr.length];
				for (int i = 0; i < arr.length; i++) {
					temp[i] = arr[i][0];
				}

				for (int i = 0; i < arr.length; i++) {
					for (int j = 1; j < arr[0].length; j++) {
						arr[i][j - 1] = arr[i][j];
					}
				}

				for (int i = 0; i < arr.length; i++) {
					arr[i][arr[0].length - 1] = temp[i];
				}
			}

		}
		return arr;
	}

	public boolean isSymmetric() {
		if (arr.length == arr[0].length) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[0].length; j++) {
					if (arr[i][j] != arr[j][i])
						return false;
				}
			}
			return true;
		}
		return false;
	}

	public boolean isIdentity() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j && arr[i][j] != 1) {
					return false;
				} else if (i != j && arr[i][j] != 0) {
					return false;
				}
			}
		}
		return true;
	}

}
