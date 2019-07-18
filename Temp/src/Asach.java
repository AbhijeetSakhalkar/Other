import java.util.HashMap;


import java.util.ArrayList;

public class Asach {

	private String word;
	private String guessedLetters;
	private int numberOfFaults;
	private ArrayList<String> letters;

	public Asach(String word) {
		this.word = word.toUpperCase();
		this.guessedLetters = "";
		this.numberOfFaults = 0;
		this.letters = new ArrayList<String>();
	}

	public String hiddenWord() {

		for (int i = 0; i < this.word.length(); i++)
		{
			char word = this.word.charAt(i);
			String wordToString = Character.toString(word);
			this.letters.add(wordToString);
			System.out.println(this.letters);
		}
		System.out.println(this.letters);

		return "";
	}
}
