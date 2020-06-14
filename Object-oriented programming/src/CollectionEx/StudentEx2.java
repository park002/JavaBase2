package CollectionEx;

public class StudentEx2 {
	public int StudentNum;
	public String name;

	public StudentEx2(int StudentNum, String name) {
		this.StudentNum = StudentNum;
		this.name = name;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return StudentNum;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof StudentEx2) {
			StudentEx2 st = (StudentEx2) obj;
			if (st.StudentNum == StudentNum) {
				return true;
			}
		}
		return false;
	}
}
