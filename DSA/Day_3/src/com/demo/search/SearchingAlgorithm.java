package com.demo.search;

public class SearchingAlgorithm {
	public int linearSearch(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;

	}

	public int biSearchNonRecur(int[] arr, int i) {
		int low = 0;
		int high = arr.length - 1;
		int cnt = 0;

		while (low <= high) {
			int mid = (low + high) / 2;
			cnt++;
			if (arr[mid] == i) {
				return mid;
			}
			if (i < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		System.out.println("comparisons are : " + cnt);
		return -1;
	}

	public static int biSearchRecur(int[] arr, int low, int high, int search) {

		if (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] == search) {
				return mid;
			} else if (search < arr[mid]) {
				return biSearchRecur(arr, search, low, mid - 1);
			} else {
				return biSearchRecur(arr, search, mid + 1, high);
			}
		}
		return -1;
	}
}
