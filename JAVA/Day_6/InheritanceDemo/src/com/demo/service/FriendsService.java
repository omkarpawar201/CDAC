package service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.demo.beans.Friends;

public class FriendsService {
	
	static int count = 0;
	static Friends[] friarr;
	////id,name,lastname,hobbies,mobno,email,bdate,address
	static {
		friarr = new Friends[10];
		friarr[0] = new Friends("abc", "cba", 1234567890, "abc@gmail.com", new Date(2001,5,13), "Pune");
		friarr[1] = new Friends("def", "fed", 1234567890, "def@gmail.com", new Date(2002,5,25), "Nashik");
		friarr[2] = new Friends("xyz", "zyx", 1234567890, "xyz@gmail.com", new Date(2003,5,8), "Nagpur");
		count = 3;
	}
	
	public static void displayAll() {
		
		for (Friends friends : friarr) {
			if (friends != null) {				
				System.out.println(friends);
			}
		}
		
	}

	public static Friends searchById(int id) {
		
		for (Friends friends : friarr) {
			if (friends != null) {
				if (friends.getId() == id) {
					return friends;
				}
			}
		}
		
		return null;
	}

	public static Friends searchByName(String name) {
		
		for (Friends friends : friarr) {
			if (friends != null) {
				if (friends.getFname().equals(name)) {
					return friends;
				}
			}
		}
		
		return null;
	}

	public static boolean addNewFriend() {
		Scanner sc = new Scanner(System.in);
		
		////id,name,lastname,hobbies,mobno,email,bdate,address
//		System.out.print("Enter the ID : ");
//		int id = sc.nextInt();
		System.out.print("Enter the First Name : ");
		String fname = sc.next();
		System.out.print("Enter the Last Name : ");
		String lname = sc.next();
		System.out.print("Enter the Mobile No. : ");
		int mn = sc.nextInt();
		System.out.print("Enter the Email : ");
		String email = sc.next();
		System.out.print("Enter the Birth Date (dd/mm/yyyy) : ");
		String date = sc.next();
		System.out.print("Enter the Address : ");
		String addr = sc.next();
		
		Date dt = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			dt = sdf.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		friarr[count] = new Friends(fname,lname,mn,email,dt,addr);
		count++;
		
		
		return true;
	}

}
