package com.technnoelevate.filpkart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Product {
	String productName;
	int cost;
	String color;
	String Details;
	int noOfQnty;

	static List<Product> asList;

	public Product(String productName, int cost, String color, String details, int noOfQnty) {
		super();
		this.productName = productName;
		this.cost = cost;
		this.color = color;
		Details = details;
		this.noOfQnty = noOfQnty;
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", cost=" + cost + ", color=" + color + ", Details=" + Details
				+ ", noOfQnty=" + noOfQnty + "]";
	}

	public static void showAllItems() {
		asList = Arrays.asList(new Product("Mobile", 25000, "black", "One Plus", 1),
				new Product("Laptop", 50000, "Gray", "HP 256GB RAM", 5),
				new Product("Camera", 15000, "Black", "Digital_SLR", 2));

		for (Iterator iterator = asList.iterator(); iterator.hasNext();) {
			Product product = (Product) iterator.next();
			System.out.println(product);
		}
	}

	public static void searchItems() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter product for search!!!");
		int n = scanner.nextInt();
		
		asList = Arrays.asList(new Product("Mobile", 25000, "black", "One Plus", 1),
				new Product("Laptop", 50000, "Gray", "HP 256GB RAM", 5),
				new Product("Camera", 15000, "Black", "Digital_SLR", 2));
		switch (n) {
		case 1:
           System.out.println(asList.get(0));
			break;
        
		case 2:
	           System.out.println(asList.get(1));
				break;
				
		case 3:
	           System.out.println(asList.get(2));
				break;
		default:
			System.out.println("Invalid input!!");
			break;
		}

	}

}
