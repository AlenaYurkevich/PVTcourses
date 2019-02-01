package core;

import java.util.Scanner;

public class Task7_8 {

	private static boolean isDigit(String str) {
		return str.matches("[0-9]+");
	}

	public static boolean isPalindrome(String text) {
		text = text.replaceAll("\\W", "");
		StringBuilder strBuilder = new StringBuilder(text);
		strBuilder.reverse(); 
		String invertedText = strBuilder.toString();

		return text.equalsIgnoreCase(invertedText);

	}

	public static void main(String args[]) {
		int n; // number of strings
		String[] text;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number of strings: ");
		if (scan.hasNextInt()) { // returns true if Int has been entered
			n = Integer.parseInt(scan.nextLine());
			text = new String[n]; // array of strings

			for (int i = 0; i < n; i++) {
				text[i] = scan.nextLine();
			}
			scan.close();

			int palindrome = 0;
			int palindromeOrder = 2;
			String str = "No palindrome";
			for (String s : text) {
				if (isDigit(s) && isPalindrome(s)) {
					palindrome++;
					if (palindrome <= palindromeOrder)
						str = s;

				}
			}

			System.out.println("Needed palindrome: " + str);
		}
	}
}
