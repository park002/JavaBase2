package _Practice;

public class Star {

	public static void main(String[] args) {
		System.out.println("��ȣ   ����   ����   ����   ����   ���");
		System.out.println("==================");
		int[][] jumsu = { { 100, 100, 100 }, { 90, 90, 90 }, { 80, 80, 80 }, { 70, 70, 70 } }; // 4�� 3��
		int kor = 0, eng = 0, mat = 0;

		for (int i = 0; i < jumsu.length; i++) { // 0~4����
			int sum = 0; /////// �ʱ�ȭ ���� 
			float avg = 0.0f;/////// �ʱ�ȭ ����

			System.out.printf("%3d", i + 1); //��ȣ
			kor += jumsu[i][0];
			eng += jumsu[i][1];
			mat += jumsu[i][2];

			for (int j = 0; j < jumsu[i].length; j++) { // 0,0 0,1 0,2 1,0 1,1 1,2
				System.out.printf("%5d", jumsu[i][j]);
				sum += jumsu[i][j];
			}
			
			avg = sum / (float) jumsu[i].length;///////
			System.out.printf("%5d %5.1f%n", sum, avg);///////
			

		}

		System.out.println("==================");
		System.out.printf("���� %d %d %d", kor, eng, mat);
	}
}
