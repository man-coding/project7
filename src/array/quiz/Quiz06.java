package array.quiz;

public class Quiz06 {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 20, 30, 0, 77 };
		int findIndex = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 20) {
				findIndex = i; // i를 치환해주는 것이 중요!!
				break;
			}
		}
		System.out.println(findIndex);
	}

}
