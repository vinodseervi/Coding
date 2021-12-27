package com.coding;

import java.util.ArrayList;

import com.coding.helper.Student;
import com.coding.service.StudentProcessor;

public class Main {

	public static void main(String[] args) {
		
		//to process student type objects
		StudentProcessor studentProcessor = new StudentProcessor();  //can we remove this line ? //Static
		
		
		
		//create a student with id 1 and name as Vinod
		
		Student student1 = new Student();
		student1.setId(1); //remove hard assignment
		student1.setName("vinod");//remove hard assignment
		
		
		//create a student with id 2 and name as Pooja
		
		Student student2 = new Student(2,"Pooja");
		
		
		
		
		//print student with simple method
		System.out.println("id : " + student1.getId() + "name : " + student1.getName());
		System.out.println("id : " + student2.getId() + "name : " + student2.getName());
		
		
		//print student with StudentProcessor Class
		
	      studentProcessor.printStudent(student1);
	      studentProcessor.printStudent(student2);
	      ArrayList<Student> students = new ArrayList<Student>();
	      students.add(student1);
	      students.add(student2);
	      studentProcessor.printStudent(students);
	      

	}

}
