package core;

import java.util.Scanner;

// 2nd variant to return the minimum number
public class Task3_1a {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in); // input values via console
		System.out.println("Enter 1st number:");
		int firstNumber = scanner.nextInt();
		System.out.println("Enter 2nd number:");
		int secondNumber = scanner.nextInt();
		scanner.close();

		int mimimum = getMinimum(firstNumber, secondNumber); // call the method
		System.out.println("Min = " + mimimum);
	}

	// method to get the minimum number using If 
	public static int getMinimum(int a, int b) {
		int min;
		if (a < b) {
			min = a;
		} else {
			min = b;
		}
		return min;
	}
}