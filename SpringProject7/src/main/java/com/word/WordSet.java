package com.word;

public class WordSet {

	private String wordKey;   //c ,c++", "java", "jsp",  "spring
	private String wordValue;// // C�� 1972�� �� �轼�� ���Ͻ� ��ġ�� 

	public WordSet(String wordKey, String wordValue) { // //c  , C�� 1972�� �� �轼�� ���Ͻ� ��ġ�� 
		this.wordKey = wordKey;
		this.wordValue = wordValue;
	}

	public String getWordKey() {
		return wordKey; //c ,c++", "java", "jsp",  "spring
	}

	public void setWordKey(String wordKey) {
		this.wordKey = wordKey;
	}

	public String getWordValue() { //C�� 1972�� �� �轼�� ���Ͻ� ��ġ�� 
		return wordValue;
	}

	public void setWordValue(String wordValue) {
		this.wordValue = wordValue;
	}

}