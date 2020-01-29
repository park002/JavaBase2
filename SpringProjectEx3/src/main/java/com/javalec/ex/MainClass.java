package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "classpath:CTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(path);
		Pencil pencil = ctx.getBean("pencil", Pencil.class);
		pencil.use();
		ctx.close();
	}

}
