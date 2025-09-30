package Week1.Day7.Advanced;

import java.util.TreeSet;

public class StudentsTest {
    public static void main(String[] args) {
        TreeSet<Students> studentsSet = new TreeSet<>();

        studentsSet.add(new Students("STU2345", 1));
        studentsSet.add(new Students("STU6789", 2));
        studentsSet.add(new Students("STU0123", 3));
        studentsSet.add(new Students("STU4567", 4));
        studentsSet.add(new Students("STU7890", 5));

        System.out.println(studentsSet);
    }
}
