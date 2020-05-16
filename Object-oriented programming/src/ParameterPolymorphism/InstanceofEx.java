package ParameterPolymorphism;

public class InstanceofEx {
	public static void method1(Parent parent) {
		if (parent instanceof Child) { // ������ Ÿ������ ����ȯ�� �������� Ȯ��
			Child child = (Child) parent;
			System.out.println("method1() Child Ÿ������ �� ��ȯ ����");
		} else {
			System.out.println("method1() Child Ÿ������ �� ��ȯ �Ұ� ");
		}
	}

	public static void method2(Parent parent) {
		Child child = (Child) parent; // classCastExecption;
		System.out.println("method2() -Child�� ��ȯ ����");
	}

	public static void main(String[] args) {
		Parent parentA = new Child(); // �ڽ��� �θ���ô �Ѵ� �ڵ�����ȯ
		method1(parentA);
		method2(parentA);
		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB);
	}

}
