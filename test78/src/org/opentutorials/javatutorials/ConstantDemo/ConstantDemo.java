package org.opentutorials.javatutorials.ConstantDemo;

//public static final Fruit APPLE = new Fruit();

enum Fruit { // enum 자체가 클래스 이므로 생성자를 가질 수 있다 .

	APPLE("Red"), PEACH("pink"), BANANA("yellow");
	private String color; // private 로 함으로써 사용자들이 직접 사용 하는 것을 막는다 . 전역변수

	public String getColor() {
		return this.color;
	}

	Fruit(String color) { // Red ,Pink ,yellow
		System.out.println("Call Constructor\t" + this); // this =>인스턴스를 가리킨다 .
		this.color = color;
	}
}

enum Company {
	// public static final Company APPLE = new Company();
	APPLE("스티브잡스"), GOOGLE("구글이에요"), ORACLE("오라클이에요");
	private String name;

	Company(String name) {
		System.out.println("Call Constructor22222\t " + this);
		this.name = name;
	}

	public String getString() {
		return this.name;
	}

}

public class ConstantDemo {

	public static void main(String[] args) {
		for (Fruit f : Fruit.values()) {
			System.out.println(f + "\tcolor=>" + f.getColor());
		}

		Company c1 = Company.GOOGLE;
		switch (c1) {
		case APPLE:
			System.out.println("NewYock! , name=>" + Company.APPLE.getString());
			break;
		case GOOGLE:
			System.out.println("GOOGLE! ,name =>" + Company.GOOGLE.getString());
		}

	}
}
