package array;

import java.util.Arrays;

//람다식 포문 사용하기 , 포문을 더 간단한 형태로 사용한다.

public class Ex05 {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// (배열에서 꺼낸 값을 저장할 변수 : 배열)
		for (int value : arr) { // 배열의 마지막 요소를 만나면 반복문을 끝냄.
			System.out.print(value + " ");
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
	}

}
