package Week1.Day7.Easy;

import java.util.ArrayList;

//Create a List of integers, remove the 3rd element, and print again.
public class ListIntegers {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<Integer>();

        for(int i=1; i<= 20; i++) {
            integers.add(i);
        }

        System.out.println("Integers list: " + integers);

        integers.remove(2);
        System.out.println("Integers list: " + integers);

    }
}
