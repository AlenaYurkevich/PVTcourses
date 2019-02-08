package core;

import java.util.Scanner;

public class Task7_1 {

	public static void main(String[] args) {

		int n; // number of strings
		String[] text;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number of strings: ");
		if (scan.hasNextInt()) { // returns true if Int has been entered
			n = Integer.parseInt(scan.nextLine());
			int indexMax = 0;
			int indexMin = 0;
			text = new String[n]; // array of Strings

			for (int i = 0; i < n; i++) {
				text[i] = scan.nextLine();
				if (text[i].length() <= text[indexMin].length())
					indexMin = i;
				if (text[i].length() >= text[indexMax].length())
					indexMax = i;
			}

			System.out.printf("MIN (%d): \"%s\"%n", text[indexMin].length(), text[indexMin]);
			System.out.printf("MAX (%d): \"%s\"%n", text[indexMax].length(), text[indexMax]);
		}
		scan.close();
	}

}
