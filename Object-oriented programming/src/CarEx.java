public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();

		// �߸��� �ӵ� ����
		myCar.setSpeed(-96);
		System.out.println("�� ���� �ӵ��� 0 �� ���̴� :  " + myCar.getSpeed());
		myCar.setSpeed(86);
		System.out.println("���� ��ȣ�� ���� CŬ���� Ÿ���ִ� �ӷ��� : " + myCar.getSpeed() + "km");
		// true ��� �õ��� ���� �ִٸ�
		System.out.println("���� isStop=>" + myCar.isStop());
		if (!myCar.isStop()) {
			myCar.setStop(true); // �õ���
		}
		// �õ�����
		System.out.println(myCar.getSpeed());

	}
}
