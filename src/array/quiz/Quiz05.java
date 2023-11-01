package array.quiz;

public class Quiz05 {

	public static void main(String[] args) {

		int[] arr = { 5, 20, 100, 30, 77 };
		int max; // 최대값을 저장하기 위한 변수
		max = arr[0];// 배열의 첫번째 값을 max 값으로 초기화

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) { // 최솟값을 구하고 싶으면 부등호를 반대로 사용.
				max = arr[i];    // arr[i] 를 치환해주는 것이 중요!!

			}
		}

		System.out.println(max);
	}

}
