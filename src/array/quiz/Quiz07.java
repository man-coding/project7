package array.quiz;

public class Quiz07 {

	public static void main(String[] args) {

		char[] charArr = new char[] { 'a', 'b', 'c', 'd', 'e' };
		char[] newArr = new char[2];

		System.arraycopy(charArr, 3, newArr, 0, 2);

		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i]);
		}
	}

}
