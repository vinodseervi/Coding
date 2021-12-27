package com.coding.helper;

public class Student {
	
	
		private int id;
		private String name;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Student(int id, String name) {
			super();
			this.id = id;
			this.name = name;
			System.out.print("Using argument Constructor to create student\n");
		}
		public Student() {
			//default constructor calling this 
			System.out.print("Using Defualt Constructor to create student\n");
		}
	

}