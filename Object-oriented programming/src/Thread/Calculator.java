package Thread;

//���� ��ü
public class Calculator {
	private int memory; // 100

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000); // �����带 2�ʰ� �Ͻ� ���� ��Ŵ
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}

}
