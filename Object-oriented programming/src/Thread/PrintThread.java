package Thread;

public class PrintThread extends Thread { // �۾� ������
	private boolean stop;

	public void setStop(boolean stop) { // �ν��Ͻ� �޼ҵ�
		this.stop = stop;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (!stop) { // stop�� false �ϰ�� while ���� ���ǽ��� true �� �Ǿ� �ݺ��Ѵ�.
						// stop�� true �� �� ��� while ���� ���ǽ� false�� �Ǿ� while�� Ż��
			System.out.println("���� ��");
		}
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}
