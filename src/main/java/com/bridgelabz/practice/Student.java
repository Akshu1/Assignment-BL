package com.bridgelabz.practice;

public class Student {
	int age;

	Student(int i) {
		age = i;

	}

	void display() {
		System.out.println("age - " + age);
	}

	public static void main(String[] args) {
		Student st = new Student(10);
		st.display();

	}
}
