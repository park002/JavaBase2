package org.opentutorials.javatutorials.accessDemo;
class A {
	public String y() { //인스턴스메소드 , return 형식 String
		return "public String y()";
	}
	private String z() {
		return "public void z()";
	}
	public String x() {
		return z();
	}
}
public class AccessDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     A a = new A();
     System.out.println(a.y());
     //System.out.println(a.z());
     System.out.println(a.x());
	}

}
