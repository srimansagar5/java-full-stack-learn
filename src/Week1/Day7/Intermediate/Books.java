package Week1.Day7.Intermediate;

import java.util.LinkedHashSet;
import java.util.Set;

//Create a LinkedHashSet of book titles, demonstrate insertion order.
public class Books {
    public static void main(String[] args) {
        String[] books = {"Beautiful Mind", "Poor Dad and Rich Dad", "Art of War"};

        Set<String> booksSet = new LinkedHashSet<>();

        for(String book: books) {
            booksSet.add(book);
        }

        for(String title: booksSet) {
            System.out.println("Books Title Order: " + title);

        }


    }
}
