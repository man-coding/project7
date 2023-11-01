package array;

public class Ex01 {

	public static void main(String[] args) {
		// 변수 3개를 사용해서 숫자 3개 저장하기
		int num1;
		int num2;
		int num3;
		num1 = 10;
		num2 = 20;
		num3 = 30;
		// 배열을 사용해서 숫자 3개 저장하기
		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
	//	arr[3] = 40; // 에러남

		int value = arr[1];
		System.out.println(value);

	}

}
