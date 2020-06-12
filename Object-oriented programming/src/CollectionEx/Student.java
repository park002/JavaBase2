package CollectionEx;

public class Student {
	public int sno;
	public String name;

	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Student) {
			Student st = (Student) obj;
			return (sno == st.sno && st.name.equals(name));
		} else
			return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return sno + name.hashCode();

	}
}
