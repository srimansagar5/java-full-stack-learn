package Week1.Day7.Advanced.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
    //Fields
    // declare name and Subjects
    // Subject is List, passing list of arrays
    private String name;
    private List<String> subjects;

    // Constructor
    public Student(String name, List<String> subjects) {

    }

    // getter and setter
    public String getName() {return name;}
    public List<String> getSubjects() {return subjects;}

    public void setName(String name) {
        if(name == null || name.isEmpty()) {
            this.name = "UNKNOWN";
        } else {
            this.name = name;
        }
    }

    public void setSubjects(List<String> subjects) {
        if(subjects == null || subjects.isEmpty()) {
            this.subjects = new ArrayList<>(Arrays.asList("NO_CLASSES"));
        } else {
            this.subjects = new ArrayList<>(subjects);
        }
    }
}
