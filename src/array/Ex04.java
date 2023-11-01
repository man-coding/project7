package array;

public class Ex04 {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i < 10; i++) { // i<=9 와 같음 숫자 10은 배열의 길이.
			System.out.print(arr[i] + " ");
		}

		System.out.println();
		for (int i = 0; i < arr.length; i++) { // arr.length -> 배열의 길이 자동으로 밸류 치환, 세어 보지 않아도 길이 입력 가능.
			System.out.print(arr[i] + " ");

		}
		System.out.println("배열의 길이:" + arr.length);
	}

}
