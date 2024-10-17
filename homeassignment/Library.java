package week1.homeassignment;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library book=new Library();
		book.addBook("Great history");
		book.issueBook();
	}
		
		public String addBook(String bookTitle) {
			System.out.println(bookTitle + " "+ "Book added successfully" );
			return bookTitle;
		}
		public void issueBook() {
			System.out.println("Book issued successfully");
		}

	}

