package org.opentutorials.javatutorials.exception;

import java.io.*;

class B {
	void run() throws FileNotFoundException, IOException {
		BufferedReader bReader = null; // undefine 해제 BufferedReader 클래스에서 bReader 변수에 null 값 부여
		String input = null; // undefine 해제
		bReader = new BufferedReader(new FileReader("out.txt")); // FileReader 객체에서 out.txt 파일찾고 BufferedReader객체에 값
		input = bReader.readLine();
		System.out.println(input);
	}
}

class C {
	void run() throws FileNotFoundException, IOException {
		B b = new B();
		b.run();

	}
}

public class ThrowExceptionDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		try {
			c.run();
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾지 못합니다");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
