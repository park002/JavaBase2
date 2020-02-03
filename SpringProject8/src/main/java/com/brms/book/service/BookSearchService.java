package com.brms.book.service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import com.brms.book.Book;
import com.brms.book.dao.BookDao;

public class BookSearchService implements DisposableBean,InitializingBean {

	@Autowired
	private BookDao bookDao;

	public BookSearchService() {
		
	}

	public Book searchBook(String bNum) {//"739", "985", "184", "830", "816"
		Book book = bookDao.select(bNum);
		return book;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(" BookSearchService() 后按眉积己");
		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("BookSearchService()后按眉家戈");
	}

}
