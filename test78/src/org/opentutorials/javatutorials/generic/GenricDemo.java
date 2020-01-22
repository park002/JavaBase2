package org.opentutorials.javatutorials.generic;

interface Info { // 인터페이스
	int getLevel(); // 메소드

	String getString();

}

///////////////////////////////////////////
class EmployeeInfo implements Info {
	public int rank; // 1
	public String rank2; // rank2;

	EmployeeInfo(int rank, String rank2) {
		this.rank = rank;
		this.rank2 = rank2;
	}

	public int getLevel() { // 메소드오버라이딩
		return this.rank;
	}

	public String getString() {
		return this.rank2;
	}
}

/////////////////////////////////////////
class Person<T extends Info> { // Info 의 자식들만 T에 올 수 있다 .
	public T info; // 전역변수
	public T info2;

	Person(T info, T info2) { // Person(EmployeeInfo info) {}
		this.info = info;
		System.out.println(info.getLevel());
		System.out.println(info.getString());
	}
}

//제네릭은 참조형,래퍼런스.Wrapper class  데이터 들만 들어 갈 수 있다 . 
public class GenricDemo {
	public static void main(String[] args) {
		EmployeeInfo in = new EmployeeInfo(1, "a");
		Person<EmployeeInfo> p1 = new Person<EmployeeInfo>(in, in);
		// Person<String> p2 = new Person<String>("부장");

	}

}
