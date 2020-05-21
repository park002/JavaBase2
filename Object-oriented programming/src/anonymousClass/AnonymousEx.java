package anonymousClass;

public class AnonymousEx {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();

		// 익명 객체 필드 사용
		anony.field.wake();

		// 익명 객체 지역변수 사용
		anony.method1();

		// 파라미터 타입으로 익명객체 타입
		anony.method2(new Person() {
			
			void study() {
				System.out.println("그리고 공부합니다 ㅎㅎ");
			}
			@Override
			void wake() {
				// TODO Auto-generated method stub
				System.out.println("8시에 기상합니다");
				study();
			}
		});
	}
}
