import java.util.Scanner;

class MaxNum{

public static void main (String args[]){
	System.out.println("Enter Three Numbers : ");
	Scanner sc= new Scanner(System.in);
	int n1 = sc.nextInt();
	int n2 = sc.nextInt();
	int n3 = sc.nextInt();
	
	if(n1 == n2 && n1 == n3)
	{
		System.out.println("Numbers Are Equal");
	}
	else if (n1 > n2 && n1>n3){
		System.out.println("Largest Number is n1 : "+n1);
	}
	else if (n2 > n3){
		System.out.println("Largest Number is n2  : "+n2);
	}
	else 
	{
	System.out.println("Largest Number is n3 : "+n3);
	}
	sc.close();
}
}