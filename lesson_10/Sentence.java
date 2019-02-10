package core;

import java.util.ArrayList;

public class Sentence implements RegExp {
	private String[] sentences;

	public String[] getSentences() {  // to demonstrate encapsulation
		return this.sentences;
	}

	public void applyRegExp(String s) {
		this.sentences = s.split("[.!?]\\s*"); // splitting the entered text into sentences;
	}

	public ArrayList<String> getChangedSentences(int number) {
		return Word.changeWordsInSentence(this.sentences, number);
	}
}
