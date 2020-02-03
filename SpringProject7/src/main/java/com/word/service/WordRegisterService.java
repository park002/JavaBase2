package com.word.service;

import javax.annotation.Resource;

import com.word.WordSet;
import com.word.dao.WordDao;

public class WordRegisterService {

	@Resource
	private WordDao wordDao;

	public WordRegisterService() {

	}

	public WordRegisterService(WordDao wordDao) { // Autowired 안했을 경우 객체를 못찾아서 오류가 발생한다 .
		System.err.println("!!!");
		this.wordDao = wordDao;
	}

	public void register(WordSet wordSet) { // c++, 벨 연구소의 비야네 스트롭스트룹이 1983

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