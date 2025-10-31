package com.demo.arrays;

public class SearchingArray {

	public int binarySearch(int[] arr, int target, int low, int high) {

		if (low <= high) {

			int mid = (low + high) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] > target) {
				binarySearch(arr, target, low, mid - 1);
			} else {
				binarySearch(arr, target, mid + 1, high);
			}
		}

		return -1;
	}

	public int binarySearch(String[] str, String target, int low, int high) {

		if (low <= high) {

			int mid = (low + high) / 2;
			if (str[mid] == target) {
				return mid;
			} else if (str[mid] > target) {
				binarySearch(str, target, low, mid - 1);
			} else {
				binarySearch(str, target, mid + 1, high);
			}
		}

		return -1;
	}
}
