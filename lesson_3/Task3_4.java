package core;

import java.util.Scanner;
import java.lang.Math;

public class Task3_4 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a value to raise to power:"); // input via console
		int value = scanner.nextInt();
		scanner.close();

		int quotient = 3; // to cube = to raise to the 3rd power

		System.out.println("The result is: " + getPower(value, quotient));
	}

	// method to raise the number (value) to the specified power (quotient)
	public static int getPower(int a, int b) {
		return (int) Math.pow(a, b);
	}
}