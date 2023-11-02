package arraylist;

import java.util.ArrayList;

//Arraylist 클래스 사용하기
public class Ex01 {

	public static void main(String[] args) {
		// Wrapper 검색해 보기.
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);

		list.add(1, 40); // 추가하는 만큼 길이가 늘어난다(빈 공간이 없다, 연속적이다.)
		System.out.println(list);

		list.remove(2); // 제거하는 만큼 줄어든다.(빈 공간이 없다, 연속적이다.)
		System.out.println(list);

		int num1 = list.get(0); // 리스트에서 값을 꺼낼 때는 get 메소드 사용.
		int num2 = list.get(1);
		int num3 = list.get(2);

		System.out.println(num1 + "," + num2 + "," + num3);

	}

}
