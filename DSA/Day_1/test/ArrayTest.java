package com.demo.test;

import java.util.Scanner;

import com.demo.arrays.MyArray;

public class ArrayTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		MyArray obj = new MyArray();
		int choice = 0;

		obj.add(2);
		obj.add(6);
		obj.add(4);
		obj.add(9);

		do {
			System.out.println("1. Add new element at end\n2. Add new element at given posistion");
			System.out.println("3. Search element\n4. Delete element\n5. Delete first occurence");
			System.out.println(
					"6. Rotate array\n7. Reverse array\n8. Swap index with values\n9. Sum of all elements\n10. Display array\n11. Exit");
			System.out.print("Enter your choice : ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1 -> {
				System.out.print("Enter the element : ");
				int num = scanner.nextInt();

				boolean status = obj.add(num);

				if (status) {
					System.out.println("Added succesfully");
				} else {
					System.out.println("Not Added");
				}
			}

			case 2 -> {
				System.out.print("Enter the element : ");
				int num = scanner.nextInt();

				System.out.print("Enter the position : ");
				int pos = scanner.nextInt();

				boolean status = obj.addAtPos(num, pos);

				if (status) {
					System.out.println("Added succesfully");
				} else {
					System.out.println("Not Added");
				}
			}

			case 3 -> {
				System.out.print("Enter the element : ");
				int num = scanner.nextInt();

				int index = obj.search(num);

				if (index == -1) {
					System.out.println("Not found....");
				} else {
					System.out.println("Element found at index " + index);
				}
			}

			case 4 -> {
				System.out.print("Enter the index : ");
				int index = scanner.nextInt();

				boolean status = obj.deleteByIndex(index);

				if (status) {
					System.out.println("Deleted succesfully");
				} else {
					System.out.println("Not found....");
				}
			}

			case 5 -> {
				System.out.print("Enter the value : ");
				int num = scanner.nextInt();

				boolean status = obj.deleteByValue(num);

				if (status) {
					System.out.println("Deleted succesfully");
				} else {
					System.out.println("Not found....");
				}
			}

			case 6 -> {
				System.out.print("Enter the no of rotations : ");
				int num = scanner.nextInt();

				int ch = 0;
				System.out.print("Do you want to rotate 1. right or 2. left : ");
				ch = scanner.nextInt();

				if (ch == 1) {
					int[] arr = obj.rotateArray(num, true);
					for (int i : arr) {
						System.out.print(i + " ");
					}
					System.out.println();
				} else {
					int[] arr = obj.rotateArray(num, false);
					for (int i : arr) {
						System.out.print(i + " ");
					}
					System.out.println();
				}

			}

			case 7 -> {
				int ch = 0;
				System.out.print("Do you want to reverse 1. same array or 2. copy of array : ");
				ch = scanner.nextInt();

				if (ch == 1) {
					int[] arr = obj.reverseArray(true);
					for (int i : arr) {
						System.out.print(i + " ");
					}
					System.out.println();
				} else {
					int[] arr = obj.reverseArray(false);
					for (int i : arr) {
						System.out.print(i + " ");
					}
					System.out.println();
				}

			}

			case 8 -> {

				int[] arr = obj.exchangeIndexValue();
				for (int i : arr) {
					System.out.print(i + " ");
				}
				System.out.println();
			}

			case 9 -> {

				int sum = obj.sumOfAll();

				System.out.println("Sum of all elements : " + sum);
			}

			case 10 -> {
				System.out.println(obj);
			}

			case 11 -> {
				System.out.println("Thanks..");
				scanner.close();
			}
			}

		} while (choice != 11);
	}

}
