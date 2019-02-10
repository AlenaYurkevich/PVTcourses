package core;

import java.util.ArrayList;

public class Word {
	
	private static String getArray(String s, int k) {
        char symbol = '%';
        return s.replaceAll(String.format("(\\b\\p{L}{%d})\\p{L}", k - 1), "$1" + symbol);
	}

	public static ArrayList<String> changeWordsInSentence(String[] sentences, int number) {
		ArrayList<String> s = new ArrayList<String>(); 
		for (int i = 0; i < sentences.length; i++) {
			s.add(Word.getArray(sentences[i], number));
		}
		
		return s;
	}
}