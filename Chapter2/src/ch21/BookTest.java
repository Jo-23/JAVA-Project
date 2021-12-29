package ch21;

public class BookTest {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		
		//for(int i = 0; i < library.length; i++) {
			
		//}
		library[0] = new Book("테백산맥1", "조사의");
		library[1] = new Book("테백산맥2", "조사의");
		library[2] = new Book("테백산맥3", "조사의");
		library[3] = new Book("테백산맥4", "조사의");
		library[4] = new Book("테백산맥5", "조사의");
		
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
	}

}
