package array.quiz;

//5개 크기의 정수형 배열을 생성하고, 1~10 중 짝수만 저장하세요.
//답: 2,4,6,8,10
import java.util.Arrays;

public class Quiz04 {

	public static void main(String[] args) {

		int[] intArr = new int[5];

		int a = 0;

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				intArr[a] = i;   // 배열 안에 i를 저장해준다.
				a++;
			}

		}
		System.out.println(Arrays.toString(intArr));
	}

}