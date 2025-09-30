package Week1.Day7.Intermediate;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//Remove a student from the HashMap by ID and print updated map.
public class Student {
    public static void main(String[] args) {
        String[] students = {"Piter", "Parker", "Smith", "David", "Polo"};

        Map<String, String> studentsSet = new HashMap<>(); // no garenty in order
        Map<String, String> studentsSetLink = new LinkedHashMap<>(); // in order

        for(int i=1; i<=students.length; i++) {
            studentsSet.put("STU" + i, students[i-1]);
        }
        System.out.println("Student Set Data: " + studentsSet);

        studentsSet.remove("STU3");
        System.out.println("Student Set Data: " + studentsSet);

        for(int i=1; i<=students.length; i++) {
            studentsSetLink.put("STU" + i, students[i-1]);
        }
        System.out.println("Student Set Data: " + studentsSetLink);
        studentsSetLink.remove("STU3");
        System.out.println("Student Set Data: " + studentsSetLink);
    }
}
