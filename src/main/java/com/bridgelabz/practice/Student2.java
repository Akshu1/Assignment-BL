package com.bridgelabz.practice;

public class Student2 {
	int age;

	Student2(int age) {
		this.age = age;

	}

	public void show(Student2 st) {
		System.out.println("age -" + this.age);
		System.out.println("age of st -" + st.age);

	}

	public static void main(String args[]) {
		Student2 ram = new Student2(10);
		Student2 shyam = new Student2(20);
		ram.show(shyam);

	}
}
