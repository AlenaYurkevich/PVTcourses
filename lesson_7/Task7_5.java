package core;

import java.util.Scanner;

public class Task7_5 {

	private static String vowels = "aeiouy";
	private static String consonants = "bcdfghjklmnpqrstvwxz";
	private static final String VOWELS = vowels + vowels.toUpperCase();
	private static final String CONSONANTS = consonants + consonants.toUpperCase();

	private static boolean isLat(String str) {
		return str.matches("[a-zA-Z]+");
	}

	private static boolean isVowel(char ch) {
		return VOWELS.indexOf(ch) >= 0;
	}

	private static boolean isConsonants(char ch) {
		return CONSONANTS.indexOf(ch) >= 0;
	}

	private static boolean checkWordForVowConsBalance(String st) {
		int vow = 0;
		int cons = 0;

		for (int i = 0; i < st.length(); i++) { // checking each element in the string
			if (isVowel(st.charAt(i)))
				vow++;
			if (isConsonants(st.charAt(i)))
				cons++;
		}

		return vow == cons;
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

			int amountOfLatOnly = 0;
			int amountWithVowConsEqual = 0;
			for (String s : text) {
				if (isLat(s)) {
					amountOfLatOnly++;

					if (s.length() % 2 == 0 && checkWordForVowConsBalance(s)) {
						amountWithVowConsEqual++;
					}
				}
			}

			System.out.println("Words with latin characters only: " + amountOfLatOnly);
			System.out.println("Words where amount of vowels = amount of consonants: " + amountWithVowConsEqual);

		}
	}
}
