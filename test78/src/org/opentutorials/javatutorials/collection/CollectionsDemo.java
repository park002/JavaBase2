package org.opentutorials.javatutorials.collection;

import java.util.*;

class Computer implements Comparable { // Comparable 정렬할 때 사용
	int serial;
	String owner;

	Computer(int serial, String owner) { // 500 , "egoing"
		this.serial = serial;
		this.owner = owner;
	}

	@Override
	public int compareTo(Object o) { // Comparable interface 에서 강제하고 있는 메소드
		//System.out.println("비교대상1: " + this.serial); // 200
		/// 클래스랑 객체의 차이점 ?
		// 클래스는 설계도
		// 객체는 설계도로 구현된 대상
		//System.out.println("비교대상2: " + ((Computer) o).serial); // 500 //
		//System.out.println("-----------------------------------------");
		return this.serial - ((Computer)o).serial; // 비교대상자 - 들어오는 값 비교
		// 500
	}

	public String toString() {
		return serial + "" + owner;
	}
}

public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Computer> computers = new ArrayList<Computer>();
		computers.add(new Computer(500, "egoing"));
		computers.add(new Computer(200, "leezche"));
		computers.add(new Computer(3233, "graphittle"));
		Iterator i = computers.iterator();
		System.out.println("before");
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		Collections.sort(computers);
		//new Computer(500, "egoing").compareTo(new Computer(200, "leezche"))
		System.out.println("\nafter");
		// i = computers.iterator();

		i = computers.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		/*
		 * Computer com2 = new Computer(500, "egoing"), com1 = new Computer(200,
		 * "leezche");
		 * 
		 * Computer[] array = new Computer[2];
		 * 
		 * array[0] = com1; array[1] = com2;
		 * 
		 * if(com1.compareTo(com2) < 0) { Computer temp = array[0]; //temp=500;
		 * array[0]= array[1]; //com1=>200 array[1] = temp; //com2=>500 }
		 * 
		 * System.out.println(Arrays.toString(array));
		 * 
		 * System.out.println(com2.compareTo(com1));
		 */
	}

}
