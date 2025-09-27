package Week1.OopsEx.LibraryItem;

//Library Management (Inheritance + Encapsulation)
//Base class LibraryItem (title, id).
//Subclasses: Book, Magazine, DVD.
//        Method: displayDetails().
//Test polymorphism.

public abstract class LibraryItem {
    private String title;
    private String id;

    //Constructor
    public LibraryItem(String title, String id) {
        setTitle(title);
        setId(id);
    }

    public String getTitle(){return title;}
    public String getId() {return id;}

    public void setTitle(String title) {
        if(title.length() > 3) {
            this.title = title;
        } else {
            this.title = "Untitled";
        }
    }

    public void setId(String id) {
        if(id.length() > 3) {
            this.id = id;
        } else {
            this.id = "UntitledID";
        }
    }


    public abstract void displayDetails();
}
