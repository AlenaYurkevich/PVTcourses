package core;

import java.util.Scanner;

public class Task7_2 {

	private static String[] orderFromMinToMax(String[] text) {
		for (int i = 0; i < text.length; i++) {
			for (int j = 0; j < text.length - 1 - i; j++) {
				if (text[j].length() > text[j + 1].length()) {
					String str = text[j];
					text[j] = text[j + 1];
					text[j + 1] = str;
				}
			}
		}

		return text;
	}

	public static void main(String args[]) {
		int n; // number of strings
		String[] text;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number of strings: ");
		if (scan.hasNextInt()) { // returns true if Int has been entered
			n = Integer.parseInt(scan.nextLine());
			text = new String[n]; // array of Strings

			for (int i = 0; i < n; i++) {
				text[i] = scan.nextLine();
			}
			scan.close();

			String[] sortedArray = orderFromMinToMax(text);

			System.out.println("Ascending order:");
			for (String s : sortedArray) {
				System.out.println(s);
			}

			System.out.println();

			System.out.println("Descending order:");
			for (int i = sortedArray.length - 1; i >= 0; i--) {
				System.out.println(sortedArray[i]);
			}
		}
	}
}
