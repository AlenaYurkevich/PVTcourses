package core;

import java.util.ArrayList;
import java.util.Scanner;

public class Paragraph {

	public static void main(String[] args) {
		String paragraph;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a paragraph: ");
		paragraph = scan.nextLine();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the letter position (double format) to be changed:");
		int number = (int) scanner.nextDouble(); // !just to demonstrate type cast
		scan.close();
		scanner.close();
		
		Sentence sentence = new Sentence();
		sentence.applyRegExp(paragraph);
		ArrayList<String> ss = sentence.getChangedSentences(number);
		System.out.println(ss);
	
	}

}