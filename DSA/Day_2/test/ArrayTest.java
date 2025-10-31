package com.demo.test;

import java.util.Scanner;

import com.demo.arrays.MyArray;

public class ArrayTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		MyArray ob = new MyArray();
		int choice = 0;

		do {
			System.out.println("1. Accept data\n2. Display array");
			System.out.println("3. Row wise sum\n4. Column wise sum\n5. Row Wise Rotation");
			System.out.println("6. Column Wise Rotation\n7. Check symmetry\n8. Check identity\n11. Exit");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();

			switch (choice) {
			case 1 -> {
				ob.acceptData();
			}

			case 2 -> {
				ob.displayArray();
			}

			case 3 -> {
				int[] arr = ob.rowWiseSum();

				for (int i : arr) {
					System.out.print(i + "  ");
				}
				System.out.println();
			}

			case 4 -> {
				int[] arr = ob.colWiseSum();

				for (int i : arr) {
					System.out.print(i + "  ");
				}
				System.out.println();
			}

			case 5 -> {
				System.out.print("Enter nomber of rotations : ");
				int num = sc.nextInt();
				System.out.print("1. Upward Rotation 2. Downward Rotation");
				int ch = sc.nextInt();

				if (ch == 1) {
					int[][] arr = ob.rowWiseRotation(true, num);

					for (int i = 0; i < arr.length; i++) {
						for (int j = 0; j < arr[0].length; j++) {
							System.out.println(arr[i][j]);
						}
						System.out.println();
					}
				} else {
					int[][] arr = ob.rowWiseRotation(false, num);

					for (int i = 0; i < arr.length; i++) {
						for (int j = 0; j < arr[0].length; j++) {
							System.out.println(arr[i][j]);
						}
						System.out.println();
					}

				}

				System.out.println();
			}

			case 6 -> {
				System.out.print("Enter nomber of rotations : ");
				int num = sc.nextInt();
				System.out.print("1. Right Rotation 2. Left Rotation");
				int ch = sc.nextInt();

				if (ch == 1) {
					int[][] arr = ob.colWiseRotation(true, num);

					for (int i = 0; i < arr.length; i++) {
						for (int j = 0; j < arr[0].length; j++) {
							System.out.println(arr[i][j]);
						}
						System.out.println();
					}
				} else {
					int[][] arr = ob.colWiseRotation(false, num);

					for (int i = 0; i < arr.length; i++) {
						for (int j = 0; j < arr[0].length; j++) {
							System.out.println(arr[i][j]);
						}
						System.out.println();
					}

				}

				System.out.println();
			}

			case 7 -> {
				boolean status = ob.isSymmetric();

				if (status) {
					System.out.println("Array is symmetric");
				} else {
					System.out.println("Array is not symmetric");
				}
			}

			case 8 -> {
				boolean status = ob.isIdentity();

				if (status) {
					System.out.println("Array is identity matrix");
				} else {
					System.out.println("Array is not identity matrix");
				}
			}

			}
		} while (choice != 10);

	}

}
