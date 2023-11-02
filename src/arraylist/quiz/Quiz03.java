package arraylist.quiz;

import java.util.ArrayList;

public class Quiz03 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("AA");
		list.add("BB");
		list.add("CC");
		list.add("DD");
		list.add("EE");

		for (String lis : list) {
			System.out.print(lis + " ");
		}
		int i = 0;
		while (i < list.size()) { // 반복문 없이 맨뒤 인덱스부터 일일이 삭제해도 됨.
			list.remove(0);
		}
		System.out.println();
		System.out.println(list);
	}
}
