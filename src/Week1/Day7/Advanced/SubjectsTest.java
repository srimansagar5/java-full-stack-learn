package Week1.Day7.Advanced;

import java.util.*;

public class SubjectsTest {
    public static void main(String[] args) {
        Subjects sub1 = new Subjects("James", new String[] {"Math"});
        Subjects sub2 = new Subjects("Robert", new String[] {"Math", "English"});
        Subjects sub3 = new Subjects("Jack", new String[] {"Math", "English", "Hindi"});
        Subjects sub4 = new Subjects("Jhony", new String[] {"Math", "English", "Hindi", "Physics"});
        Subjects sub5 = new Subjects("Jean", new String[] {"Math", "English", "Hindi", "Physics", "Natural Science"});

        HashMap<String, List<String>> studentSet = new HashMap<>();
        studentSet.put(sub1.getName(), Arrays.asList(sub1.getClasses()));
        studentSet.put(sub2.getName(), Arrays.asList(sub2.getClasses()));
        studentSet.put(sub3.getName(), Arrays.asList(sub3.getClasses()));
        studentSet.put(sub4.getName(), Arrays.asList(sub4.getClasses()));
        studentSet.put(sub5.getName(), Arrays.asList(sub5.getClasses()));

        for(Map.Entry<String, List<String>> entry: studentSet.entrySet()) {
            String student = entry.getKey();
            List<String> subjects = entry.getValue();
            System.out.println(student + " -> " + subjects);
        }

        HashMap<String, List<String>> sudentSubjects = new HashMap<>();
        sudentSubjects.put("James", Arrays.asList("Math", "Science", "English"));
        sudentSubjects.put("Bob", Arrays.asList("History", "Science", "Math"));
        sudentSubjects.put("Charlie", Arrays.asList("Biology", "Chemistry", "Physics"));

        for(Map.Entry<String, List<String>> entry: sudentSubjects.entrySet()) {
            String student = entry.getKey();
            List<String> subjects = entry.getValue();
            System.out.println(student + " -> " + subjects);
        }



    }
}
