package ApiDocument;

public class Student {
	private String studentNum; // 필드

	public Student(String studentNum) { // 생성자
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}

	@Override
	public boolean equals(Object obj) { // 매개변수의 다형성
		// Object obj = std2;
		// TODO Auto-generated method stub
		if (obj instanceof Student) { // 좌항의 타입이 우항의 타입으로 형변환이 가능한가 ?
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
