package ApiDocument;

public class SystemTimeEx {
	public static void main(String[] args) {
		
		long time1 = System.nanoTime(); // ���α׷� ���� �ð� �б�
		int sum = 0;

		for (int i = 1; i <= 1000000; i++) { // 1���� �鸸������ ��
			sum += i;
		}
		long time2 = System.nanoTime(); // �� �ð� �б�
		
		System.out.println("1~1000000 ������ �� : " + sum);
		System.out.println("��꿡" + (time2 - time1) + "�����ʰ� �ҿ�Ǿ����ϴ�");
	}
}
