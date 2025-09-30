package Week1.Day7.Easy;

import java.util.*;

//Store 5 unique cities in a HashSet and print them.
public class UniqueCities {
    public static void main(String[] args) {
        String[] topCities = {"New York", "New Delhi", "Berlin", "Moscow", "Colombo", "New Delhi", "Berlin", "Moscow" };

        Set<String> cities = new HashSet<String>();
        for (String city: topCities) {
            cities.add(city);
        }
        System.out.println("Unique cities: "+ cities);

        // Linked Hash set
        Set<String> linkCities = new LinkedHashSet<String>();
        for(String city: topCities) {
            linkCities.add(city);
        }
        System.out.println("Linked cities: " + linkCities);

        // Hash Tree
        Set<String> treeCities = new TreeSet<String>();
        for(String city: topCities) {
            treeCities.add(city);
        }
        System.out.println("Tree Cities: " + treeCities);

    }
}
