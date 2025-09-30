package Week1.Day7.Easy;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//(List/Set/Map basics)
//Create a List of 5 colors, print them using a for loop.
public class ListColors {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<String>();
        colors.add("RED");
        colors.add("GREEN");
        colors.add("BLUE");
        colors.add("YELLOW");
        colors.add("PINK");

        for (String color : colors) {
            System.out.println(color);
        }
        // get color
        System.out.println("Get 4th Color: " + colors.get(3));
        // update color
        colors.set(1, "LIGHT GREEN");
        System.out.println("2nd color is updated: " + colors.get(1));
        // remove color
        System.out.println("PINK color is removed: " + colors.remove("PINK"));
        // colors length
        System.out.println("Final length of colors: " + colors.size());

        for( String color: colors) {
            System.out.println("Final colors: " + color);
        }

        //Linked List
        LinkedList<String> linkColors = new LinkedList<String>();
        linkColors.add("Indian Red");
        linkColors.add("Salmon");
        linkColors.add("Crimson");
        linkColors.add("Fire Brick");
        linkColors.add("Dark Red");

        for(String linkColor : linkColors) {
            System.out.println("Linked Colors List: " + linkColor);
        }
        // Add first and last colors
        linkColors.addFirst("Deep Pink");
        // get first and last colors
        System.out.println("Get First and Last colors of LinkedColors: First Color: " + linkColors.getFirst() + " Last color: " + linkColors.getLast());


    }
}
