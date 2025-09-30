package Week1.Day7.Advanced;

import java.util.ArrayList;
import java.util.List;

public class ProductTest {
    public static void main(String[] args) {
        Product book = new Product("BK1", "Beautiful Mind", 10.99);
        Product dvd = new Product("DV1", "", 12.22);
        Product pdf = new Product("PD1", "Health Material", 2.23);
        Product word = new Product("", "Project Documents", 1.23);
        Product excel = new Product("EX1", "Budget Template", 5.23);

        Product[] productData = {book, dvd, pdf, word, excel };

        List<Product> productsSet = new ArrayList<>();
        for(Product p: productData) {
            productsSet.add(p);
        }

        for(Product product: productsSet) {
            System.out.println("Product Details: ID: "
                    + product.getId()
                    + ", Name: " + product.getName()
                    + ", Price: " + product.getPrice()
            );
        }



    }
}
