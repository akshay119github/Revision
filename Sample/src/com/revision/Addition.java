package com.revision;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {

		System.out.println("Enter a: ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.println("Enter b: ");
		int b = scanner.nextInt();

		int c = a + b;
		int d = a - b;
		int e = a * b;

		System.out.println("Addition of " + a + " & " + b + " is " + c);
		System.out.println("Substraction of " + a + " & " + b + " is " + d);
		System.out.println("Multiplication of " + a + " & " + b + " is " + e);
	}

}
