package core;

import java.lang.Math;

public class Task3_2 {
	public static void main(String args[]) {
		int a = 0;
		int b = 50;
		int number = a + (int) (Math.random() * b);
		System.out.println("Randomly selected number: " + number);

		boolean result = isEvenNumber(number); // call the method
		System.out.println("Is the number even? " + result);
	}

	// method to check whether the number is even or odd
	public static boolean isEvenNumber(int a) {
		return a % 2 == 0;
	}
}