package ch21;

public class ObjectCopyTest {

	public static void main(String[] args) {

        Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("테백산맥1", "조사의");
		library[1] = new Book("테백산맥2", "조사의");
		library[2] = new Book("테백산맥3", "조사의");
		library[3] = new Book("테백산맥4", "조사의");
		library[4] = new Book("테백산맥5", "조사의");
		
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();
		

		for(int i = 0; i < library.length; i++) {
			copyLibrary[i].setAuthor(library[i].getAuthor());
			copyLibrary[i].setTitle(library[i].getTitle());
		}
		
		library[0].setAuthor("박완서");
		library[0].setTitle("나육");
		
		System.out.println("== library ==");
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
	}
		System.out.println("== copylibrary ==");
		for(Book book : copyLibrary) {
			System.out.println(book);
			book.showInfo();
	}
	}
	
}
