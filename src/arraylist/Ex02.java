package arraylist;

import java.util.ArrayList;

//반복문을 이용해서 리스트의 요소 출력하기
public class Ex02 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>(); // 비어있는 리스트가 만들어짐.

		list.add(10); // 값을 넣어준다.
		list.add(20);
		list.add(30);

		System.out.print(list.get(0) + " ");
		System.out.print(list.get(1) + " ");
		System.out.print(list.get(2) + " ");
		System.out.println();

		for (int i = 0; i < list.size(); i++) { // 배열과 다르게 size를 쓴다. 리스트 안에 있는 값을 편하게 꺼낼 때 반복문 사용.
			int num = list.get(i);
			System.out.print(num + " ");
		}

	}

}
