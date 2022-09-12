package com.technoelevate.exception.customeexception.assignment;

@SuppressWarnings("serial")
public class InsufficientPlayerException extends Exception {
	
	InsufficientPlayerException(String msg){
		super(msg);
	}
}
