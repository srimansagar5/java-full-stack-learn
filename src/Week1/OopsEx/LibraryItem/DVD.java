package Week1.OopsEx.LibraryItem;

public class DVD extends LibraryItem {
    public DVD(String title, String id) {
        super(title, id);
    }

    public void displayDetails() {
        System.out.println("DVD Details: DVD Name: " + getTitle() + ", DVD ID: " + getId());
    }
}
