package inheritance;

public class Student extends People {
	public int studentNo;

	public Student(String People, String ssn, int studentNo) {
		super(People, ssn); // 부모클래스의 생성자가 기본생성자가 아닐 경우 반드시 생성자를 명시적으로 작성 해주어야 한다 .
		this.studentNo = studentNo;
		System.out.println(studentNo);
	}

	public static void main(String[] args) {
		Student st = new Student("재호 럭키가이", "만세", 7);
		System.out.println("People : " + st.People);
		System.out.println("ssn : " + st.ssn);
	}

}
