package array;

public class Ex08 {

	public static void main(String[] args) {

		int[][] arr = { { 2, 4, 6 }, { 3, 6, 7 } };
		int[][] arr1 = new int[2][3];

		for (int i = 0; i < arr.length; i++) {// i는 1차원 배열의 인덱스

			for (int j = 0; j < arr[i].length; j++) {// j는 2차원 배열의 인덱스
				System.out.print(arr[i][j] + " "); // i,j 인덱스가 2개
			}
			System.out.println();
		}
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("[" + i + "," + j + "]");
			}
			System.out.println();
		}

	}
}
