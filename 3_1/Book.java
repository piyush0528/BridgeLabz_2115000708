public class Book {
    static String libraryName = "Central Library";
    final String isbn;
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
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
    }
    public static void main(String[] args) {
        Book book1 = new Book("2 States", "Chetan Bhagat", "978675765728897");
        Book book2 = new Book("Half Girlfriend", "Chetan Bhagat", "5364789609798898");
	System.out.println(book1 instanceof Book);
        System.out.println(book2 instanceof Book);
	book1.displayBookDetails();
        book2.displayBookDetails();
        Book.displayLibraryName();
    }
}
