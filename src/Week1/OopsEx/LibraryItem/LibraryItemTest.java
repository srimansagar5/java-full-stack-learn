package Week1.OopsEx.LibraryItem;

public class LibraryItemTest {
    public static void main(String[] args) {
        LibraryItem book = new Book("Beautiful Mind", "BEMI4532");
        LibraryItem magazine = new Magazine("IIFA", "IIFA3245");
        LibraryItem dvd = new DVD("Blue Ray", "BR5933");

        LibraryItem[] libraryItems = {book, magazine, dvd};
        for(LibraryItem li: libraryItems){
            li.displayDetails();
        }
    }
}
