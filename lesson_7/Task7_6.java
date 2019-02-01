package core;

import java.util.Scanner;

public class Task7_6 {

	public static boolean checkIfAscending(String word) {

		for (int i = 0; i < word.length() - 1; i++) {
			if (word.charAt(i) > word.charAt(i + 1)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String args[]) {
		int n; // number of Strings
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

			for (String word : text) {
				if (checkIfAscending(word)) {
					System.out.println(word);
					return; // to print only the 1st valid string, not all
				}
			}

		}
	}
}
