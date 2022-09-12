package com.technoelevate.exception.customeexception.assignment;

import java.util.Scanner;

public class Cricket {
	
    public static void main(String[] args) throws InsufficientPlayerException {
    	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter how many players you want to play cricket!!!");
    String n=sc.next();
    
    String a[]=new String[12];
    System.out.println("Enter the names of players: ");
    for (int i = 0; i < a.length; i++) {
		if(i<=11) {
			a[i]=sc.next();
			}else {
			throw new InsufficientPlayerException("Cricket having only 11 players");

	}

	}
    
    sc.close();
    }
}
