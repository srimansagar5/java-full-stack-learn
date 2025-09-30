package Week1.Day7.Advanced;

import java.util.ArrayList;
import java.util.List;

//Create a Product class (id, name, price). Store 5 products in an ArrayList and print all.
public class Product {
    // Fields
    private String id;
    private String name;
    private double price;

    // Constructor
    public Product(String id, String name, double price) {
        setId(id);
        setName(name);
        setPrice(price);
    }

    //getters
    public String getId() {return id;}
    public String getName() {return name;}
    public double getPrice() { return price; }

    // setters
    public void setId(String id) {
        if(id.isEmpty()){
            System.out.println("Please enter ID.");
            this.id = id.isEmpty() ? "default_ID": id;
        } else {
            this.id = id;
        }
    }

    public void setName(String name) {
        if(name == null || name.isEmpty()) {
            this.name = "UNKNOWN";
        } else if(name.length() < 3){
            this.name = "INVALID_NAME";
        } else {
            this.name = name;
        }
    }

    public void setPrice(double price) {
        if(price > 0){
            this.price = price;
        } else {
            System.out.println("Price set to zero.");
            this.price = 0;
        }
    }


}

