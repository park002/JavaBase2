package org.opentutorials.javatutorials.Polymorphism;

interface father {
}

interface mother {
}

interface programmer {
	public void coding();
}

interface beliver {
}

class Steve implements father, programmer, beliver {
	public void coding() {
		System.out.println("fast");
	}
	public void aaa() {
		System.out.println("사용불가");
	}

}

class Rachel implements mother, programmer {
	public void coding() {
		System.out.println("elegance");
	}
}

public class Workspace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		programmer employee1 = new Steve(); //다형성 Steve 클래스(객체)를 인스턴스를 employee1 에 담고 Programmer 데이터타입 참조 
		programmer employee2 = new Rachel();

		employee1.coding();
		employee2.coding();

	}

}
