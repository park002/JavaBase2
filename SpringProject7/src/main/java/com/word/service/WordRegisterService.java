package com.word.service;





import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.word.WordSet;
import com.word.dao.WordDao;

public class WordRegisterService {
	
	@Autowired
	@Qualifier("usedDao")
	private WordDao wordDao;

	public WordRegisterService() {

	}

	public WordRegisterService(WordDao wordDao) { // Autowired ������ ��� ��ü�� ��ã�Ƽ� ������ �߻��Ѵ� .
		System.err.println("!!!");
		this.wordDao = wordDao;
	}

	public void register(WordSet wordSet) { // c , C�� 1972�� �� �轼�� ���Ͻ� ��ġ��

		String wordKey = wordSet.getWordKey(); // c ,c++", "java", "jsp", "spring
		if (verify(wordKey)) { // c ,c++", "java", "jsp", "spring
			wordDao.insert(wordSet);
		} else {
			System.out.println("The word has already registered.");
		}
	}

	public boolean verify(String wordKey) { // c ,c++", "java", "jsp", "spring
		WordSet wordSet = wordDao.select(wordKey); // c ,c++", "java", "jsp", "spring
		return wordSet == null ? true : false;
	}

	public void setWordDao(WordDao wordDao) {
		this.wordDao = wordDao;
	}

}