package Week1.Day7.Advanced.Student;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentTest {
    public static void main(String[] args) {

        Student s1 = new Student("James", Arrays.asList("Math"));
        Student s2 = new Student("Johny", Arrays.asList("Math", "English"));
        Student s3 = new Student("Jack", Arrays.asList("Math", "English", "Hindi"));
        Student s4 = new Student("Jerry", Arrays.asList("Math", "English", "Hindi", "Physics"));
        Student s5 = new Student("Jean", Arrays.asList("Math", "English", "Hindi", "Physics", "Natural Science"));

        HashMap<String, List<String>> studentSubjects = new HashMap<>();
        studentSubjects.put(s1.getName(), s1.getSubjects());
        studentSubjects.put(s2.getName(), s2.getSubjects());
        studentSubjects.put(s3.getName(), s3.getSubjects());
        studentSubjects.put(s4.getName(), s4.getSubjects());
        studentSubjects.put(s5.getName(), s5.getSubjects());

        for(Map.Entry<String, List<String>> entry: studentSubjects.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


    }
}
