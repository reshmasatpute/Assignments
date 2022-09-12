package com.technoelevate.collection.linklist;

import java.util.LinkedList;

public class Jspider {
        public static void main(String[] args) {
        	 LinkedList<Student> linkedList=new LinkedList<>();
        	 linkedList.add(new Student(1, "Reshu"));
        	 linkedList.add(new Student(5, "Akshada"));
        	 linkedList.add(new Student(5, "Kiran"));
        	 
        	for(Student student:linkedList) {
        		System.out.println(student);
        	}
		}
         
}
