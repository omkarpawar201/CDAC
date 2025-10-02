package Aarray2D;

import java.util.Scanner;

public class Array2DService {

	public static void displayData(int[][] arr1) {
		
		System.out.println("The Array is");
		for(int i = 0; i< arr1.length;i++)
	    {
	      for(int j = 0; j < arr1[i].length; j++)
	      {
	          System.out.print(arr1[i][j]+" ");
	      }
	      System.out.print("\n");
	    }
		
	}

	public static void acceptData(int[][] arr1) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Array");
		for(int i = 0; i< arr1.length;i++)
	    {
	      for(int j = 0; j < arr1[i].length; j++)
	      {
	          arr1[i][j] = sc.nextInt();
	      }
	    }
		
	}

	public static int addAllNumbers(int[][] arr1) {
		int sum=0;
		
		for(int i = 0; i < arr1.length;i++) {
			for(int j = 0; j < arr1[i].length;j++) {
				sum += arr1[i][j];
			}
		}
		return sum;
	}

	public static int[] addRowwise(int[][] arr1) 
	{
		int[] sum=new int[arr1.length];
		
		for(int i = 0; i < arr1.length; i++) 
		{
			sum[i] = 0;
			for(int j = 0; j <arr1[i].length; j++) {
				sum[i] += arr1[i][j];
			}
		}
		return sum;
	}

	public static int[] addColumnwise(int[][] arr1) 
	{
		int[] sum = new int[arr1[0].length];
		
		for(int i = 0; i <arr1[0].length; i++) 
		{  
			for(int j = 0; j < arr1.length; j++) 
			{  
				sum[i] += arr1[j][i];
			}
		}
		return sum;
	}

	public static int maxOfAll(int[][] arr1) {
		
		int max = arr1[0][0];
		
		for(int i = 0; i< arr1.length;i++)
	    {
	      for(int j = 0; j < arr1[i].length; j++)
	      {
	          if(max < arr1[i][j]) {
	        	  max = arr1[i][j];
	          }
	      }
	    }
		
		return max;
	}

	public static int[] maxOfAllRows(int[][] arr1) {
		
		int[] max=new int[arr1.length];
		
		for(int i = 0; i < arr1.length; i++) 
		{
			max[i] = arr1[i][0];
			for(int j = 0; j < arr1[i].length; j++) 
			{
				if(max[i] < arr1[i][j]) {					
					max[i] = arr1[i][j];
				}
			}
		}
		return max;
	}

	public static int[] maxOfAllCol(int[][] arr1) 
	{
		int[] max = new int[arr1[0].length];
		
		for(int i = 0; i < arr1[0].length; i++) 
		{
			max[i] = arr1[0][i];
			for(int j = 0; j < arr1.length; j++) 
			{
				if(max[i] < arr1[i][j]) {					
					max[i] = arr1[i][j];
				}
			}
		}
		return max;
	}

	public static int[][] addTwoDarrays(int[][] arr1, int[][] arr2) 
	{
		int[][] sum = new int[arr1.length][arr1[0].length];
		
		for(int i = 0; i < arr1.length; i++) 
		{
			for(int j = 0; j < arr1[i].length; j++) 
			{
				sum[i][j] = arr1[i][j] + arr1[i][j];
			}
		}
		return sum;
	}

	public static int[][] multiplyTwoArray(int[][] arr1, int[][] arr2) 
	{
		int[][] mul = new int[arr1.length][arr1[0].length];
		
		for(int i = 0; i < arr1.length; i++) 
		{
			for(int j = 0; j < arr1[0].length; j++) 
			{
				for(int k = 0; k < arr1[0].length; k++) 
				{
					mul[i][j] += arr1[i][k] * arr1[k][j];
				}
			}
		}
		return mul;
	}

	public static int[][] findTranspose(int[][] arr1) 
	{
		int[][] trans = new int[arr1.length][arr1[0].length];
		
		for(int i = 0; i < arr1.length; i++) 
		{
			for(int j = 0; j < arr1[i].length; j++) 
			{
				trans[i][j] = arr1[j][i];
			}
		}
		return trans;
	}

	public static boolean checkIdentity(int[][] arr1) 
	{
		for(int i = 0; i < arr1.length; i++) 
		{
			for(int j = 0; j < arr1[0].length; j++) 
			{
				if(i == j && arr1[i][j] != 1)
				{
					return false;
				}
				else if(i!=j && arr1[i][j] != 0)
				{
					return false;
				}
			}
		}
		return true;
	}

	public static int[][] rotateRow(int[][] arr1) 
	{
		int[][] temp = new int[arr1.length][arr1[0].length];
		
		for(int i = 0; i < arr1.length - 1; i++) 
		{
			for(int j = 0; j < arr1[i].length; j++) 
			{
				temp[i][j] = arr1[i][j];
				arr1[i][j] = arr1[i+1][j];
				arr1[i+1][j] = temp[i][j];
			}
		}
		
		return arr1;
	}

	public static int[][] rotateCols(int[][] arr1) 
	{
		int[][] temp = new int[arr1.length][arr1[0].length];
		
		for(int i = 0; i < arr1.length; i++) 
		{
			for(int j = temp[0].length - 2; j >= 0; j--) 
			{
				temp[j][i] = arr1[j][i];
				arr1[j][i] = arr1[j][i-1];
				arr1[j][i-1] = temp[j][i];
			}
		}
		
		return arr1;
	}

	public static int[] convertTo1DArray(int[][] arr1) 
	{
		int[] arr = new int[arr1.length*arr1[0].length];
		int count=0;
		
		for(int i = 0; i < arr1.length; i++) 
		{
			for(int j = 0; j < arr1[i].length; j++) 
			{
				arr[count] = arr1[i][j];
				count++;
			}
		}
		return arr;
	}

}
