package Thread;

public class AutoSaveThread extends Thread { // �۾�������
	public void save() {
		System.out.println("�۾� ������ ������.");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			try {
				Thread.sleep(1000); // �Ͻ�����.
			} catch (InterruptedException e) {
				// TODO: handle exception
				break;
			}
			save();
		}
	}
}
