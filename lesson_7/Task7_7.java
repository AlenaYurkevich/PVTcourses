package core;

import java.util.Scanner;

public class Task7_7 {

	private static boolean diffSymbols(String st) {
		StringBuilder unique = new StringBuilder(); // string where each symbol is encountered only once
		String currentSymbol; // the current symbol in the string
		for (int i = 0; i < st.length(); i++) {
			currentSymbol = String.valueOf(st.charAt(i)); // get the current symbol
			if (unique.indexOf(currentSymbol) == -1) // symbol has not yet been encountered
				unique.append(currentSymbol); // add to string
		}

		return st.length() == unique.length();
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

			for (String word : text) {
				if (diffSymbols(word)) {
					System.out.println("String with unique symbols: " + word);
					return; // to print only the 1st valid string, not all
				}
			}
		}
	}
}
