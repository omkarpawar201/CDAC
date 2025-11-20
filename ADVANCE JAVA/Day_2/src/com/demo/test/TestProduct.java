package com.demo.test;

import com.demo.beans.Product;
import com.demo.services.ProductServices;
import com.demo.services.ProductServicesImpl;

import java.util.List;
import java.util.Scanner;

public class TestProduct {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ProductServices pser = new ProductServicesImpl();
		int choice = 0;

		do {
			System.out.println("1. Add new product\n2. Delete product\n3. Modify product");
			System.out.println("4. Find by Id\n5. Display all\n6. Display in sorted order\n7. Exit");
			System.out.print("choice : ");
			choice = sc.nextInt();

			switch (choice) {
			case 1 -> {
				boolean status = pser.addNewProd();

				if (status)
					System.out.println("Added Successfully");
				else
					System.out.println("Not added");
			}

			case 2 -> {
				System.out.print("Enter id to delete : ");
				int id = sc.nextInt();

				boolean status = pser.deleteProd(id);

				if (status)
					System.out.println("Deleted Successfully");
				else
					System.out.println("Not added");
			}

			case 3 -> {
				System.out.print("Enter id to update : ");
				int id = sc.nextInt();
				System.out.print("Enter qty : ");
				int qty = sc.nextInt();
				System.out.print("Enter price : ");
				double price = sc.nextDouble();

				boolean status = pser.updatePro(id, qty, price);

				if (status)
					System.out.println("Updated Successfully");
				else
					System.out.println("Not added");
			}

			case 4 -> {
				System.out.print("Enter id to search : ");
				int id = sc.nextInt();

				Product p = pser.findProd(id);
				System.out.println(p);
			}

			case 5 -> {
				List<Product> pst = pser.display();

				pst.forEach(System.out::println);
			}

			case 6 -> {
				List<Product> pst = pser.sortByPrice();

				pst.forEach(System.out::println);
			}

			case 7 -> {
				System.out.println("Thanks...");
				sc.close();
			}
			}
		} while (choice != 7);
	}
}
