package Abstractpackage;

public class HttpServletEx {

	public static void main(String[] args) {
		// 추상클래스 같은경우는 객체를 직접 생성할 수 없다
		method(new LoginServlet());
		method(new FileDownloadServlet());
	}

	public static void method(HttpServlet httpServlet) {
		httpServlet.service();
	}

}
