package com.demo.test;

import java.util.Arrays;

import com.demo.sort.BubbleSort;

public class SortTest {

	public static void main(String[] args) {
		int[] arr = { 1, 6, 13, 56, 24, 9, 85 };
		
		BubbleSort ob = new BubbleSort();
		// BubbleSortAlgorithm.bubbleSort(arr);
		// BubbleSortAlgorithm.bubbleSortImproved(arr);
		ob.bubbleSortImprovedDescending(arr);
		
		System.out.println(Arrays.toString(arr));

	}

}
