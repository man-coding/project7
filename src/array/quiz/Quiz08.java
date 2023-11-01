package array.quiz;

public class Quiz08 {

	public static void main(String[] args) {

		Student[] student1 = new Student[3];

		student1[0] = new Student(20231018, "둘리");
		student1[1] = new Student(20231019, "또치");
		student1[2] = new Student(20231020, "도우너");

		for (int i = 0; i < student1.length; i++) {
			student1[i].showInfo();
		}
	}

}

class Student {

	int studentID;
	String name;

	public Student(int studentID, String name) {
		super();
		this.studentID = studentID;
		this.name = name;
	}

	public void showInfo() {
		System.out.println("학번: " + studentID + " 이름: " + name);

	}

}
