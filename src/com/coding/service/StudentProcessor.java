package com.coding.service;

import java.util.ArrayList;

import com.coding.helper.Student;

public  class StudentProcessor {
	
	public  void printStudent(Student student) {
		
		System.out.println("student id : " + student.getId() + " student name : " + student.getName());
		
	}
	
	//implement printing multiple students : Hint using Array of object or method overloading
    public void printStudent(ArrayList<Student> students) {
    	
    	for(Student student : students) System.out.print("id $ name " + student.getId() + " : " + student.getName());
    	
    }
	

}
