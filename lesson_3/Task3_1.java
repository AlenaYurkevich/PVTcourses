package core;

import java.util.Scanner;
import java.lang.Math;

public class Task3_1 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in); // input 2 numbers via console
		System.out.println("Enter 1st number:");
		int firstNumber = scanner.nextInt();
		System.out.println("Enter 2nd number:");
		int secondNumber = scanner.nextInt();
		scanner.close();

		int mimimum = getMinimum(firstNumber, secondNumber); // call the method and print the result
		System.out.println("Min = " + mimimum);
	}

	// method to return the minimum number
	public static int getMinimum(int a, int b) {
		int min = Math.min(a, b);
		return min;
	}
}