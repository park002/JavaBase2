package com.word;

public class WordSet {

	private String wordKey;   //c  ++
	private String wordValue;// / 

	public WordSet(String wordKey, String wordValue) { // //c  , C�� 1972�� �� �轼�� ���Ͻ� ��ġ�� 
		this.wordKey = wordKey;
		this.wordValue = wordValue;
	}

	public String getWordKey() { //c++
		return wordKey;
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