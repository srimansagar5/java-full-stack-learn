package Week1.OopsEx.LibraryItem;

public class Book extends LibraryItem {
    // Constructor
    public Book(String title, String id) {
        super(title, id);
    }

    public void displayDetails() {
        System.out.println("Book Details: Title: " + getTitle() + ", ID: " + getId());
    }
}
