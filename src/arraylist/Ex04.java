package arraylist;

import java.util.ArrayList;

//도우너 학생은 국어,영어,과학,

public class Ex04 {

	public static void main(String[] args) {
		Student student1 = new Student("둘리");
		student1.subjectList.add(new Subject("국어", 100));
		student1.subjectList.add(new Subject("수학", 50));
		student1.showInfo();

		Student student2 = new Student("도우너");
		student2.subjectList.add(new Subject("국어", 70));
		student2.subjectList.add(new Subject("영어", 85));
		student2.subjectList.add(new Subject("과학", 70));
		student2.subjectList.add(new Subject("사회", 85));
		student2.showInfo();

	}

}

class Subject {
	String name;
	int score;

	public Subject(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

}

class Student {
	String studentName;
	ArrayList<Subject> subjectList; // 수강과목을 저장할 리스트 수강할 과목이 여러 과목이기 때문에 ArrayList를 사용.(1개면 String subject 하면 됨)

	public Student(String studentName) {
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>(); // 인스턴스 리스트 생성 이게 없으면 에러남
	}

	public void showInfo() {
		int total = 0;

		for (Subject s : subjectList) { // 순회하여 s에 저장해줌.
			total = total + s.score; // 총점에 점수를 계속 더함.
		}
		System.out.println(studentName + " 학생의 총점은 " + total + " 입니다.");
	}

}
