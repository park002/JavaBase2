package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "classpath:ApplicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(path);
		Student student1 = ctx.getBean("student", Student.class);
		System.out.println(student1.getName());
		System.out.println(student1.getAge());
		System.out.println("===");
		Student student2 = ctx.getBean("student", Student.class);
		student2.setName("홍길동");
		student2.setAge(25);
		System.out.println(student2.getName());
		System.out.println(student2.getAge());
		System.out.println(student1.getName());
		System.out.println(student1.getAge());
		if (student1.equals(student2)) {
			System.out.println("참조형데이터 !");
		} else {
			System.out.println("객체가 같지 않습니다");
		}

	}

}
