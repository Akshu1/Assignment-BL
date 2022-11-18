//Write a program to check two strings are equal or not.

package com.bridgelabz.practice;

public class twostringsequalornot {

	public static void main(String Args[]) {
		String s1 = "Akshatha";
		String s2 = "Akshatha";
		String s3 = "xyz";
		System.out.println(s1 == s2);//using ==operator
		System.out.println(s2 == s3);
		System.out.println(s3 == s1);
		System.out.println(s1.equals(s2));//using equal()Method
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s1));
		System.out.println("Done");
	}
}