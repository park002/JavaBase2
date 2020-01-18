package org.opentutorials.javatutorials.exception;

class Z {
	private int[] arr = new int[3];

	Z() { // 생성자 = 클래스 이름과 메소드 이름이 같은 것
		arr[0] = 0;
		arr[1] = 10;
		arr[2] = 20;
	}

	public void z(int first, int second) {
		try {
			System.out.println(arr[first] / arr[second]);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class ExceptionDemo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Z vv = new Z();
		vv.z(10, 1);
	}

}
