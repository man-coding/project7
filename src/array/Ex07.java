package array;

public class Ex07 {

	public static void main(String[] args) {

		Book[] library = new Book[5];

		/// for (int i = 0; i < library.length; i++) {
		// System.out.print(library[i] + " ");
		// }
		// library[0].showInfo(); // 참조변수가 빈 값일 때는 쓸 수 없다.

		library[0] = new Book("태백산맥", "조정래");
		library[1] = new Book("데미안", "헤르만 헤세");
		library[2] = new Book("어떻게 살 것인가", "유시민");
		library[3] = new Book("토지", "박경리");
		library[4] = new Book("어린왕자", "생택쥐페리");

//		for (int i = 0; i < library.length; i++) {
//			System.out.print(library[i] + " "); // 주소값을 가리키고 있다.
//		}
		for (int i = 0; i < library.length; i++) {
			library[i].showInfo(); // 별도 메소드를 써야 함.
		}
	}
}

class Book {
	String bookName;
	String author;

	public Book(String bookName, String author) {
		super();
		this.bookName = bookName;
		this.author = author;
	}

	public void showInfo() {
		System.out.println(bookName + "," + author);
	}

}
