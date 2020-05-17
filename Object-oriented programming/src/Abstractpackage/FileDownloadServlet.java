package Abstractpackage;

public class FileDownloadServlet extends HttpServlet {
	@Override
	public void service() {
		// 오버라이딩 같은경우는 부모클래스에 있는 메소드를 자식클래스가 재정의 하는 것이다
		// 리턴타입,메소드명,파라미터 타입이나 개수가 같아야한다
		System.out.println("파일 다운로드합니다.");
	}
}
