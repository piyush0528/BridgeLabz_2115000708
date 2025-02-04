public class Book {
static String libraryName = "Central City Library"; 
final String isbn;  // final variable to ensure ISBN cannot be changed
String title;
String author;

public Book(String title, String author, String isbn) {
this.title = title;
this.author = author;
this.isbn = isbn;
}

public static void displayLibraryName() {
System.out.println("Library Name: " + libraryName);
}

public void displayBookDetails() {
if (this instanceof Book) {
System.out.println("Title: " + title);
System.out.println("Author: " + author);
System.out.println("ISBN: " + isbn);
} else {
System.out.println("This is not a valid Book object.");
}
}

public static void main(String[] args) {
Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084");

displayLibraryName();  // Calling static method
book1.displayBookDetails();  // Display details of book1
book2.displayBookDetails();  // Display details of book2
}
}
