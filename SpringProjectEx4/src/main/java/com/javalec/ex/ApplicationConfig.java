package com.javalec.ex;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

	@Bean
	public Student student1() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("수영");
		list.add("배구");
		Student student = new Student("길동스");
		student.setHobbys(list);
		student.setAge(25);
		return student;
	}

	@Bean
	public Student student2() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("독서");
		list.add("음악감상");
		Student student = new Student("길순이");
		student.setHobbys(list);
		student.setAge(5);
		return student;

	}

}
