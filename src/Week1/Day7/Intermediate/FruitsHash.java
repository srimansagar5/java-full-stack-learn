package Week1.Day7.Intermediate;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Use an Iterator to traverse a HashSet of fruits.
public class FruitsHash {
    public static void main(String[] args) {
        String[] fruits = {"Mango", "Apple", "Papaya", "Banana", "Grapes"};

        Set<String> fruitsHash = new HashSet<>();

        for(String fruit: fruits) {
            fruitsHash.add(fruit);
        }

        Iterator<String> itFruit = fruitsHash.iterator();

        while (itFruit.hasNext()){
            System.out.println("Traversing fruit: " + itFruit.next());
        }
    }

}
