package org.opentutorials.javatutorials.generic;

class StudentInfo {
	public int grade;

	StudentInfo(int grade) {
		this.grade = grade;
	}
}

class EmployeeInfo {
	public int rank; //123

	EmployeeInfo(int rank) {
		this.rank = rank;

	}
}

class Person {
	public Object info;   //Object EmployeeInfo(123)
	
	public Person(Object info) { 
		this.info = info;
	}
}
//wrapper class 
public class GenricDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//객체 형이 다른 형태 캐스팅 할때 맞지 않으면 나는 오류 입니다.
		Person p1 = new Person(new EmployeeInfo(123)); // String값으로 "부장"
		//값으로써의 object 는 어떤 걸로도 변환을 못한다.
		//Object -> Object
		//Object obj; <- String, Integer, Person, GenericDemo
		//new Object();
		//(String)obj
	//Object 변수에다 String 값이 들어갔다 .
		//String을  EmployeeInfo 로 형변환 하려한다 .
		EmployeeInfo ei =(EmployeeInfo) p1.info; //데이터타입 Object 인데 EmployeeInfo(123)값 들어간 상황
		//System.out.println(ei.rank);
		System.out.println(ei.rank);
	
	}

}
