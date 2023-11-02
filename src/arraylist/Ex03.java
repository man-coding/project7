package arraylist;

import java.util.ArrayList;

public class Ex03 {

	public static void main(String[] args) {

		ArrayList<Book> list = new ArrayList<Book>();

		list.add(new Book("태백산맥", "조정래"));
		list.add(new Book("데미안", "헤르만 헤세"));
		list.add(new Book("어떻게 살 것인가", "유시민"));

		System.out.println("=== 일반 for문 사용 ===");
		for (int i = 0; i < list.size(); i++) {
			Book book = list.get(i); // 요소를 꺼내는 식이 필요함 // 인덱스도 출력하고 싶으면 일반 for문을 써야 함.
			book.showBookInfo();
		}

		System.out.println("=== 람다식 for문 사용 ===");
		for (Book book : list) { // 이미 조건에서 요소를 꺼냄.
			book.showBookInfo(); // 요소를 꺼내는 식이 필요없음. 간편함.
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

	public void showBookInfo() {
		System.out.println(bookName + "," + author);

	}

}