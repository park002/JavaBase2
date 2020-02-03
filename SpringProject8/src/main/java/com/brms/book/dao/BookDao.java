package com.brms.book.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import com.brms.book.Book;

public class BookDao implements InitializingBean, DisposableBean { //DB

	private Map<String, Book> bookDB = 	new HashMap<String, Book>(); //DB
	//key("String")
	//value(Book)
	
	
	public void insert(Book book) { 
		bookDB.put(book.getbNum(), book);
		//"985" , ==>value 985 , css , true, null
		//"739" , ==>value 739 , html , true, null
		//"184", 
		//"830",
		//"816"
	}
	
	public Book select(String bNum) {//"739", "985", "184", "830", "816"
		return bookDB.get(bNum);
	}
	
	public void update(Book book) {
		
	}
	
	public void delete() {
		
	}
	
	public Map<String, Book> getBookDB() {
		return bookDB;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("빈(Bean)객체 생성 단계");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("빈(Bean)객체 소멸 단계");
	}
	
}
