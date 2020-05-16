package Polymorphism;

public class Controller {
	public MemberService service;

	public void setService(MemberService service) {
		this.service = service;
	}

	public static void main(String[] args) {
		Controller ct = new Controller();
		ct.setService(new ZService());
		ct.service.StarService();

	}

}
