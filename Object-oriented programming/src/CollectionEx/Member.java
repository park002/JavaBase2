package CollectionEx;

public class Member {
	public String name;
	public int age;

	Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Member) {
			Member mem = (Member) obj;
			return mem.name.equals(name) && mem.age == age;
		} else
			return false;
	}

	@Override
	public int hashCode() { // name 과 age값이 같으면 동일한 hashCode리턴.
		// TODO Auto-generated method stub
		return name.hashCode() + age;
	}
}
