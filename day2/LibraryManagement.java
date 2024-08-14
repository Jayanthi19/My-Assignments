package week1.day2;

public class LibraryManagement {

	public static void main(String[] args) {
		Library lm = new Library();
		  String bookTitle = lm.addBook("Java");
	        System.out.println("Added Book Title: " + bookTitle);
		lm.issueBook();

	}

}

