package com.technnoelevate.filpkart;

import java.util.Scanner;

public class Flipkart {
	public static void main(String[] args) {
      
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1 for show all items \n2 Enter for search an items:");
		int n = scanner.nextInt();
		if (n == 1) {
			Product.showAllItems();
		} else {
			Product.searchItems();
		}

	}

}
