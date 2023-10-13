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

		System.out.println("Addition of " + a + " & " + b + " is " + c);
	}

}
