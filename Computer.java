package com.technoelevate.object.assignment;

public class Computer {
    public static void main(String[] args) {
		OS os=new OS("Window");
		System.out.println(os.toString());
		
		OS os2=new OS("Solaris");
		System.out.println(os2.toString());
	}
}
