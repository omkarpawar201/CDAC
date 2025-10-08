package Test;

import java.util.Scanner;

import com.demo.beans.Friends;

import service.FriendsService;

public class FriendsTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		do {
			System.out.println("\n1. Display All Friend\n2. Search by id\n3. Search by name");
			System.out.println("4. Display all friend with a particular hobby");
			System.out.println("5. Add new friend\n6. Exit");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1: {
				FriendsService.displayAll();
				break;
			}
			
			case 2: {
				System.out.print("Enter the ID : ");
				int id = sc.nextInt();
				
				Friends friends =  FriendsService.searchById(id);
				
				if (friends != null) {
					System.out.println(friends);
				}
				else {
					System.out.println("Not Found");
				}
				break;
			}
				
			case 3: {
				System.out.print("Enter the name : ");
				String name = sc.next();
				
				Friends friends =  FriendsService.searchByName(name);
				
				if (friends != null) {
					System.out.println(friends);
				}
				else {
					System.out.println("Not Found");
				}
				break;
			}
			
			case 5: {
		
				boolean status =  FriendsService.addNewFriend();
				
				if (status) {
					System.out.println("Added Succesfully");
				}
				else {
					System.out.println("Error...");
				}
				break;
			}
			
			default:
				System.out.println("Wrong choice");
			}
			
		} while (choice != 6);
		
		sc.close();
	}

}
