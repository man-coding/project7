package arraylist.quiz;

import java.util.ArrayList;

public class Quiz02 {

	public static void main(String[] args) {

		ArrayList<Boolean> list = new ArrayList<Boolean>();

		list.add(true);
		list.add(true);
		list.add(false);

		for (int i = 0; i < list.size(); i++) { // 일반 for문
			boolean bool = list.get(i);
			System.out.print(bool + " ");
		}
		System.out.println();
		for (Boolean i : list) { // 람다식 for문
			System.out.print(i + " ");

		}
		System.out.println();
		boolean first = list.get(0);
		boolean last = list.get(list.size() - 1); // 마지막 인덱스 표현식
		System.out.println("첫번째:" + first + " 마지막:" + last);
	}

}
