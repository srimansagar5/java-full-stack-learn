package Week1.OopsEx.LibraryItem;

public class Magazine extends LibraryItem {
    public Magazine(String title, String id) {
        super(title, id);
    }

    public void displayDetails() {
        System.out.println("Magazine Details: Magazine Name: " + getTitle() + ", Magazine ID: " + getId());
    }
}
