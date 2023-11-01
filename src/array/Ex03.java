package array;

//반복문을 이용해서 배열의 요소 출력하기

public class Ex03 {

	public static void main(String[] args) {

		int[] intArr = new int[100];
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		System.out.println(intArr[2]);

		for (int i = 0; i < 100; i++) {  //i의 값을 인덱스로 사용하는 것 훨씬 간결.
			System.out.print(intArr[i] + " ");
		}
	}

}
