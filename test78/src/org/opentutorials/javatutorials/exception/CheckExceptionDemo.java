package org.opentutorials.javatutorials.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckExceptionDemo {

	public static void main(String[] args) {

//		BufferedReader bReader = null;
		String input = null; // 괄호 지역변수
		// String input = null;

		try (BufferedReader bReader = new BufferedReader(
				new FileReader("src/org/opentutorials/javatutorials/exception/out.txt"))) {
//			bReader = new BufferedReader(new FileReader("src/org/opentutorials/javatutorials/exception/out.txt"));
			input = bReader.readLine();// 읽어들인다 괄호지역변수쓰는중
		} catch (IOException e) {
			e.printStackTrace();
		} // 오류가 발생해도 밑으로 로직 타고 슝슝내려감

		System.out.println(input);

	} // main();

} // class CheckExceptionDemo;
