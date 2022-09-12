package com.technoelevate.assignment;

import java.util.Scanner;

public class Parsel {
	static Address currentAddress;
	static Address permanentAddr;
	static Address companyAddr;
	public static void main(String[] args) {
		
		public void address() {
			System.out.println("select your address: \n1.current address \n2.permanent address \n3.comapny Address:");
			Scanner scanner=new Scanner(System.in);
			int a=scanner.nextInt();
			switch (a) {
			case 1:{
				System.out.println("This is your Current addess:");
				currentAddress.details();
			}
				break;
			case 2:{
				System.out.println("This is your permanent addess:");
				permanentAddr.details();
			}break;
			case 3:{
				System.out.println("This is your Company addess:");
				companyAddr.details();
			}break;
			default:
				System.out.println("Address is not present");
				break;
			}
			
	}
	
}
