package com.word.service;

import javax.annotation.Resource;

import com.word.WordSet;
import com.word.dao.WordDao;

public class WordRegisterService {

	@Resource
	private WordDao wordDao;

	public WordRegisterService() {

	}

	public WordRegisterService(WordDao wordDao) { // Autowired ������ ��� ��ü�� ��ã�Ƽ� ������ �߻��Ѵ� .
		System.err.println("!!!");
		this.wordDao = wordDao;
	}

	public void register(WordSet wordSet) { // c++, �� �������� ��߳� ��Ʈ�ӽ�Ʈ���� 1983

		String wordKey = wordSet.getWordKey();  //c++
		if (verify(wordKey)) { // true
			wordDao.insert(wordSet);
		} else {
			System.out.println("The word has already registered.");
		}
	}

	public boolean verify(String wordKey) { // c++
		WordSet wordSet = wordDao.select(wordKey);  // null
		return (wordSet == null ? true : false); // null ?   o o true
	} 

	public void setWordDao(WordDao wordDao) {
		this.wordDao = wordDao;
	}

}