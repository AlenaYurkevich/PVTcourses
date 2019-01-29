package core;

import java.util.Scanner;
import java.lang.Math;

public class Task3_3 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a value to raise to power:"); // input via console
		int value = scanner.nextInt();
		scanner.close();

		int quotient = 2; // taking the square = raising to the 2nd power

		System.out.println("The result is: " + getPower(value, quotient));
	}

	// method to raise the number (value) to the specified power (quotient)
	public static int getPower(int a, int b) {
		return (int) Math.pow(a, b);
	}
}