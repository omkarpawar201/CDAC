package com.demo.test;

import com.demo.arrays.SearchingArray;

public class TestSearch {

	public static void main(String[] args) {
		SearchingArray ob = new SearchingArray();

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		String[] str = {"hello", "world", "india", "pune"};
		
		int target = 4;
		String str1 = "india";
		int low = 0;
		int high = str.length - 1;

//		int pos = ob.binarySearch(arr, target, low, high);
		int pos = ob.binarySearch(str, str1, low, high);

		if (pos != -1) {
			System.out.println("Element found at " + pos + " index");
		} else {
			System.out.println("Not found....");
		}

	}

}
