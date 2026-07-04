class Student {
	private static Student obj = null;

	int rollNumber;
	String name;

	private Student() {};

	void run() {
		System.out.println("I am running");
	}

	public static Student getStudentObject() {
		if (obj == null) {
			obj = new Student();
		}
		return obj;
	}
}

public class Solve {
	public static void main(String[] args) {
		Student s1 = Student.getStudentObject();
		Student s2 = Student.getStudentObject();
		if (s1 == s2) {
			System.out.println("Only 1 object got created");
		} else {
			System.out.println("Two objects got created");
		}
	}
}
