package ApiDocument;

public class Student {
	private String studentNum; // �ʵ�

	public Student(String studentNum) { // ������
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}

	@Override
	public boolean equals(Object obj) { // �Ű������� ������
		// Object obj = std2;
		// TODO Auto-generated method stub
		if (obj instanceof Student) { // ������ Ÿ���� ������ Ÿ������ ����ȯ�� �����Ѱ� ?
			Student std = (Student) obj;
			if (studentNum.equals(std.studentNum)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Integer.parseInt(studentNum);
	}

}
