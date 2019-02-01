package core;

import java.util.Scanner;

public class Task7_3 {

	public static void main(String[] args) {
		int n; // number of strings
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number of strings: ");
		if (scan.hasNextInt()) {
			n = Integer.parseInt(scan.nextLine());
			int total = 0;
			String[] text = new String[n];
			for (int i = 0; i < n; i++) {
				text[i] = scan.nextLine();
				total += text[i].length();
			}
			int average = total / n;

			System.out.printf("Average string length (%d)\n", average);
			System.out.println("Less than average:");
			for (int i = 0; i < n; i++) {
				if (text[i].length() < average)
					System.out.println("(" + text[i].length() + "): \"" + text[i] + "\"");
			}
			System.out.println("More than average:");
			for (int i = 0; i < n; i++) {
				if (text[i].length() > average)
					System.out.println("(" + text[i].length() + "): \"" + text[i] + "\"");
			}
		}
		scan.close();
	}

}
