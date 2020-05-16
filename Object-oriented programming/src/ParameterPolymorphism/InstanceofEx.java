package ParameterPolymorphism;

public class InstanceofEx {
	public static void method1(Parent parent) {
		if (parent instanceof Child) { // 우항의 타입으로 형변환이 가능한지 확인
			Child child = (Child) parent;
			System.out.println("method1() Child 타입으로 형 변환 성공");
		} else {
			System.out.println("method1() Child 타입으로 형 변환 불가 ");
		}
	}

	public static void method2(Parent parent) {
		Child child = (Child) parent; // classCastExecption;
		System.out.println("method2() -Child로 변환 성공");
	}

	public static void main(String[] args) {
		Parent parentA = new Child(); // 자식이 부모인척 한다 자동형변환
		method1(parentA);
		method2(parentA);
		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB);
	}

}
