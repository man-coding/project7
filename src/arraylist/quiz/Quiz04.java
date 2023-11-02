package arraylist.quiz;

import java.util.ArrayList;

public class Quiz04 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();

		list.add(new Student(120103565, "둘리"));
		list.add(new Student(120103505, "또치"));

		for (Student student : list) { // 람다식 요소를 인스턴스 변수에 바로 저장.
			student.showInfo();

		}
		System.out.println();
		for (int i = 0; i < list.size(); i++) { // 일반
			Student student = list.get(i); // 요소를 꺼내는 식이 필요.
			student.showInfo();
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
		System.out.println("학번: " + studentID + " " + "이름: " + name);
	}

}