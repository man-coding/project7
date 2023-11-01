package array.quiz;

//반복문을 사용하여 배열요소의 합을 구하고 출력.
public class Quiz03 {

	public static void main(String[] args) {

		int[] intArr = new int[] { 10, 15, 20, 25, 30 };
		int sum = 0; // 합을 저장할 변수

		for (int value : intArr) {
			sum = sum + value;
		}
		System.out.println(sum);
	}

}
