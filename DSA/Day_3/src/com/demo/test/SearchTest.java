package com.demo.test;

import com.demo.search.SearchingAlgorithm;

public class SearchTest {

	public static void main(String[] args) {
		
		SearchingAlgorithm ob = new SearchingAlgorithm();
		
		int[] arr = { 25, 8, 3, 9, 16, 20, 35 };

		int pos = ob.linearSearch(arr, 7);
		if (pos != -1) {
			System.out.println("Found at index (Linear Serach) : " + pos);
		} else {
			System.out.println("Not found !!!");
		}

		int[] arr1 = { 11, 21, 31, 45, 50 };
		pos = ob.biSearchNonRecur(arr1, 31);
		if (pos != -1) {
			System.out.println("Found at index (Binary Serach) : " + pos);
		} else {
			System.out.println("Not found !!!");
		}

		pos = SearchingAlgorithm.biSearchRecur(arr1, 31, 0, 5);
		if (pos != -1) {
			System.out.println("Found at index (Binary Serach) : " + pos);
		} else {
			System.out.println("Not found !!!");
		}

	}

}
