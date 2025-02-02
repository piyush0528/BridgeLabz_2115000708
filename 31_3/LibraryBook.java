class Book {
    public String ISBN;
    protected String title;
    private String author;
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
}
class EBook extends Book {
    public void displayDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
    }
}
public class LibraryBook {
    public static void main(String[] args) {
        EBook eBook = new EBook();
        eBook.ISBN = "123-456-789";
        eBook.title = "Java Programming";
        eBook.setAuthor("John Smith");
        eBook.displayDetails();
        System.out.println("Author: " + eBook.getAuthor());
    }
}
