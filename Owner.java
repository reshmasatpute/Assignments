package com.technoelevate.assignment2;

import java.util.Scanner;

public class Owner {
	
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Laptop you want 1 for HP/2 for Dell");
	 int n=sc.nextInt();
	Dell dell=new Dell();
	if (n==1) {
		dell.buyLaptop();
	} else {
      dell.buyLaptop();
	}
}
}
