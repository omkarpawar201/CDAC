package Aarray2D;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		
		int arr1[][] = new int [2][2];
		int arr2[][] = new int [2][2];
		Scanner sc=new Scanner(System.in);

		Array2DService.acceptData(arr1);
		Array2DService.acceptData(arr2);
		Array2DService.displayData(arr1);
		Array2DService.displayData(arr2);
		
		int choice = 0;
		
		do {
			System.out.println("1. add all numbers\n2. add rowwise\n3. columnwise addition");
			System.out.println("4. find max of all numbers\n5. maximum rowwise\n6. find maximum columnwise");
			System.out.println("7. add 2 arrays\n8. multiply array\n9. find transpose of array");
			System.out.println("10. check identity matrix\n11. rotate matrix rows\n12. rotate matrix columns");
			System.out.println("13. convert to 1D array\n14. exit\n");
			
			System.out.print("Enter your choice : ");
			choice=sc.nextInt();
			
			switch(choice) {
			
			case 1:
				int ans=Array2DService.addAllNumbers(arr1);
				System.out.println("Addition of all array elements : "+ ans);
				System.out.println();
				break;
			
			case 2:
				int[] rowadd=Array2DService.addRowwise(arr1);
				for(int i:rowadd) {  
					System.out.println(i);
				}
				break;
			
			case 3:
				 int[] coladd = Array2DService.addColumnwise(arr1);
				for(int i:coladd) {  
					System.out.println(i);
				}
				break;
			
			case 4:
				ans = Array2DService.maxOfAll(arr1);
				System.out.println("Maximum of all array elements : "+ ans);
				System.out.println();
				break;
				
			case 5:
				int [] res = Array2DService.maxOfAllRows(arr1);
				for(int i:res) {  
					System.out.println(i);
				}
				
				break;
				
			case 6:
				int[] res1 = Array2DService.maxOfAllCol(arr1);
				for(int i:res1) {  
					System.out.println(i);
				}
				
				break;
				
			case 7:
				int[][] add = Array2DService.addTwoDarrays(arr1,arr2);
				Array2DService.displayData(add);
				break;
				
			case 8:
				int[][] multiply = Array2DService.multiplyTwoArray(arr1,arr2);
				Array2DService.displayData(multiply);
				break;
			
			case 9:
				int[][] trans = Array2DService.findTranspose(arr1);
				Array2DService.displayData(trans);
				break;
				
			case 10:
				boolean flag = Array2DService.checkIdentity(arr1);
				if(flag) {
					System.out.println("It is identity matrix");
				}
				else {
					System.out.println("It is not identity matrix");
				}
				break;
			
			case 11:
				int[][] res2 = Array2DService.rotateRow(arr1);
				Array2DService.displayData(res2);
				break;
				
			case 12:
				res2 = Array2DService.rotateCols(arr1);
				Array2DService.displayData(res2);
				break;
			
			case 13:
				int[] res3 = Array2DService.convertTo1DArray(arr1);
				for(int i:res3) {
					System.out.print(i  + " ");
				}
				System.out.println();
				break;
				
			case 14:
				System.out.println("Thank you for visiting.....");
				break;
				
			default:
				System.out.println("choice is wrong");
				break;
			}
			
		}while(choice!=14);
		
		sc.close();
	}

}
