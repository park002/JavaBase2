package Abstractpackage;

public class HttpServletEx {

	public static void main(String[] args) {
		// �߻�Ŭ���� �������� ��ü�� ���� ������ �� ����
		method(new LoginServlet());
		method(new FileDownloadServlet());
	}

	public static void method(HttpServlet httpServlet) {
		httpServlet.service();
	}

}
