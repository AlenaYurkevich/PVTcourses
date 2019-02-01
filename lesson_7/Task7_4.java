package core;

import java.util.Scanner;

public class Task7_4 {

	private static int diffSymbols(String st) { 
		StringBuilder unique = new StringBuilder(); // string where each symbol is encountered only once
		String currentSymbol; // the current symbol in the string
		for (int i = 0; i < st.length(); i++) { 
			currentSymbol = String.valueOf(st.charAt(i)); // get the current symbol
			if (unique.indexOf(currentSymbol) == -1) // symbol has not yet been encountered
				unique.append(currentSymbol); // add to string
		}

		return unique.length(); // returns the length of the updated string
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

			String goal = text[0];

			for (int i = 1; i < text.length; i++) {
				if (diffSymbols(text[i]) < diffSymbols(goal))
					goal = text[i]; // new min element
			}
			System.out.println("The word with a min variety of symbols: " + goal + ", number of different symbols: " + diffSymbols(goal));
		}
	}
}
