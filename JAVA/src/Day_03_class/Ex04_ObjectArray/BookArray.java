package Day_03_class.Ex04_ObjectArray;

import java.util.Scanner;

/* 책 제목, 저자명을 갖는 Book클래스를 정의하고, 
 * Book 클래스타입의 객체 배열을 챙성하여
 * 사용자로부터 책 3권을 입력받아 출력하는 프로그램을 만드시오.
 */

class Book{
	String title, author;
	
	public Book(){
		this("제목없음", "작자미상");
	}

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}
	
}
	public class BookArray{
		public static void main(String[] args) {
		
		Book[] bookArray = new Book[3];
		Scanner sc = new Scanner(System.in);
		
		//사용자 입력
		for (int i = 0 ; i < bookArray.length; i++) {
			System.out.println("제목 : ");
			String title = sc.nextLine();
			System.out.println("저자 : ");
			String author = sc.nextLine();
			
		// Book객체를 생성하여 bookArray 배열 요소에 삽입
			bookArray[i] = new Book(title, author);
		}
		
		// 출력
		for(Book book:bookArray) {
			System.out.println(book);
		}
		sc.close();
	}
}