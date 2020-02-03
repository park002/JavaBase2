package com.brms.book.service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import com.brms.book.Book;
import com.brms.book.dao.BookDao;

public class BookRegisterService  implements InitializingBean ,DisposableBean{

	@Autowired
	private BookDao bookDao;

	public BookRegisterService() {
		
	}

	public void register(Book book) { 
		bookDao.insert(book);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(" BookRegisterService() 后按眉积己");
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("BookRegisterService() 后按眉家戈");
	}
	

}