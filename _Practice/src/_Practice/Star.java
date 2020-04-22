package _Practice;

import java.util.Random;
import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte p = 10;
		byte n = -10;
		System.out.printf("p = %d \t%s%n", p,toBinaryString(p));
		System.out.println("\t\t00000000000000000000000000001010");
	}

	static String toBinaryString(int x) { // 10진수를 2진수로 변환하는 메소드
		String zero = "00000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x); //2진수로 변환
		return tmp.substring(tmp.length() - 32);

	}
   

}
