package week1.day2;

public class Library {

	public String addBook(String bookTitle) {
		System.out.println("Book added sucessfully");
		return bookTitle;

	}
     public void issueBook()  {
     System.out.println("Book issued successfully");
		
	}
     public static void main(String[] args) {
		Library li = new Library();
		
	
		
	     String bookTitle = li.addBook("Selenium");
	        System.out.println("Added Book Title: " + bookTitle);
	        li.issueBook();
	}
}







