package Thread;

public class User1 extends Thread {
	private Calculator calculator; // �ʵ�

	public void setCalculator(Calculator calculator) { // ex)100����
		this.setName("User1"); // ������ �̸��� User1���� ����
		// this �� ���� ���� Ŭ������ ������� �ν��Ͻ��� ����Ű�� ����.
		this.calculator = calculator;
	}

	@Override
	public void run() { // �۾�������
		// TODO Auto-generated method stub
		calculator.setMemory(100);
	}

}
