package Test;

public class StringTest {

	public static void main(String[] args) {
		
		String str1 = "sadbutsad";
		String str2 = "sad";
		String str3 = "It finds the position of the first occurrence of given substring";
		
		int i = str1.indexOf(str2);
		System.out.println("Index of "+str2+ " in " + str1 +" is "+i);
		
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		System.out.println(str1.contains(str2));
		
		String[] arr = str3.split(" ");
		
		for (String string : arr) {
			
			System.out.print(string + ",");
		}

		System.out.println();
		String str4 = String.join(" ",arr);
		System.out.println(str4);
		
		System.out.println(str1.startsWith(str2));
		System.out.println(str1.endsWith(str2));
		
		System.out.println(str3.charAt(10));
		
		System.out.println(str2.compareTo(str1));
		
		arr = str4.split(" ");
		
		for (String string : arr) {
			
			char a = string.charAt(0);
			String s = a + string.substring(1);
		}
		

	}

}
