package inheritance;

public class SupersonicAirplane extends Airplane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

	public int flyMode = NORMAL;

	@Override
	public void fly() { // �������̵� �θ�Ŭ������ �ִ� �޼ҵ带 �ڽ�Ŭ������ �� ����
		// �޼ҵ��� �ñ״�ó���� ���ƾ��Ѵ� �̸�,�Ķ���� Ÿ�� ���� ����Ÿ��
		// TODO Auto-generated method stub
		if (flyMode == SUPERSONIC)
			System.out.println("������ ������ �����մϴ�");
		else
			super.fly();

	}
}
