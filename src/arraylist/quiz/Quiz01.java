package arraylist.quiz;

import java.util.ArrayList;

public class Quiz01 {

	public static void main(String[] args) {

		ArrayList<Character> list = new ArrayList<Character>();

		list.add('A');
		list.add('B');
		list.add('C');

		char ch1 = list.get(0);
		char ch2 = list.get(1);
		char ch3 = list.get(2);
		System.out.println(ch1 + " " + ch2 + " " + ch3);

		System.out.println(list);

	}

}
