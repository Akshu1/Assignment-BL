package com.bridgelabz.practice;

public class Array2D {
	public static void main(String args[]) {
		int integerArray[][] = new int[10][10];

		for (int i = 0; i < integerArray.length; i++) {
			for (int j = 0; j < integerArray.length; j++) {
				integerArray[i][j] = i + j + 1;
				System.out.println("Array-" + integerArray[i][j]);
			}

		}
	}
}