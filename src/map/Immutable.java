package map;

import java.util.HashMap;
import java.util.Map;
public class Immutable {
	public static void main(String[] args) {
		Map<Student,Integer> marks = new HashMap<>();
		Student s1 = new Student(1, "Alice");
		Student s2 = new Student(2, "Bob");
		marks.put(s1, 90);
		marks.put(s2, 79);
		System.out.println(marks.get(s1));
		s1.name="Alice kk";
		System.out.println(marks.get(s1));
		s1.name=new String("Alice");
		System.out.println(marks.get(s1));
	}

}



class Student {
	int id;
	String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}


