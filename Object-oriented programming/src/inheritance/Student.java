package inheritance;

public class Student extends People {
	public int studentNo;

	public Student(String People, String ssn, int studentNo) {
		super(People, ssn); // �θ�Ŭ������ �����ڰ� �⺻�����ڰ� �ƴ� ��� �ݵ�� �����ڸ� ��������� �ۼ� ���־�� �Ѵ� .
		this.studentNo = studentNo;
		System.out.println(studentNo);
	}

	public static void main(String[] args) {
		Student st = new Student("��ȣ ��Ű����", "����", 7);
		System.out.println("People : " + st.People);
		System.out.println("ssn : " + st.ssn);
	}

}
