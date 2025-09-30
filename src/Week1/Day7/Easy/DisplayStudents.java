package Week1.Day7.Easy;

import java.util.HashMap;
import java.util.Map;

//Create a HashMap of 3 students (ID → name) and print each entry.
public class DisplayStudents {
    public static void main(String[] args) {
        String[] studentNames = {"Bruce", "Wayne", "Dent"};

        Map<String, String> studentDetails = new HashMap<>();
        for(int i=1; i<=studentNames.length; i++) {
            studentDetails.put("STU" + i, studentNames[i - 1]);
        }
//Currently you loop over studentDetails.keySet() and then call get(studentID) each time.
//That’s fine, but less efficient — for large maps, it means an extra lookup.
//        for(String studentID: studentDetails.keySet()){
//            System.out.println("Student ID: " + studentID + " and Name: " + studentDetails.get(studentID));
//        }

        // using entrySet()
        for(Map.Entry<String, String> entry: studentDetails.entrySet()) {
            System.out.println("Student ID: " + entry.getKey() + " and Name: " + entry.getValue());
        }
    }
}
