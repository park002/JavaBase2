package org.opentutorials.javatutorials.exception;

class A2 {
	private int[] arr = new int[3];

	A2() { // 생성자 = 클래스 이름과 메소드 이름이 같은 것
		arr[0] = 0;
		arr[1] = 10;
		arr[2] = 20;
	}

	public void z(int first, int second) {
		try {
			System.out.println(arr[first] / arr[second]);//2,1  ==> 20/10 
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("나는 try catch 밑에 언제나 실행되는 finally 다 ");
		}
	}
}

public class ExceptionDemo2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A2 a = new A2();
		a.z(10, 0); // ArrayIndexOutOfBoundsException
		a.z(1, 0); // ArithmeticException
		a.z(2, 1); // 정상
	}

}
