package com.word;

public class WordSet {

	private String wordKey;   //c ,c++", "java", "jsp",  "spring
	private String wordValue;// // C´Â 1972³â ÄË Åè½¼°ú µ¥´Ï½º ¸®Ä¡°¡ 

	public WordSet(String wordKey, String wordValue) { // //c  , C´Â 1972³â ÄË Åè½¼°ú µ¥´Ï½º ¸®Ä¡°¡ 
		this.wordKey = wordKey;
		this.wordValue = wordValue;
	}

	public String getWordKey() {
		return wordKey; //c ,c++", "java", "jsp",  "spring
	}

	public void setWordKey(String wordKey) {
		this.wordKey = wordKey;
	}

	public String getWordValue() { //C´Â 1972³â ÄË Åè½¼°ú µ¥´Ï½º ¸®Ä¡°¡ 
		return wordValue;
	}

	public void setWordValue(String wordValue) {
		this.wordValue = wordValue;
	}

}