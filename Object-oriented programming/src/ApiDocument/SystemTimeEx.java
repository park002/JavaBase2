package ApiDocument;

public class SystemTimeEx {
	public static void main(String[] args) {
		
		long time1 = System.nanoTime(); // 프로그램 시작 시간 읽기
		int sum = 0;

		for (int i = 1; i <= 1000000; i++) { // 1부터 백만까지의 합
			sum += i;
		}
		long time2 = System.nanoTime(); // 끝 시간 읽기
		
		System.out.println("1~1000000 까지의 합 : " + sum);
		System.out.println("계산에" + (time2 - time1) + "나노초가 소요되었습니다");
	}
}
