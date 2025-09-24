package Week1.Day4;

public class StudentTest {
    public static void main(String[] args) {
        Student colStudent = new Student("John Wick", "A");
        Student colStudent2 = new Student("Transporter", "Z");

        colStudent.displayDetails();

        colStudent.setGrade("B");

        System.out.println("Studnet Name: " + colStudent.getName());
        System.out.println("Studnet Grade: " + colStudent.getGrade());

        colStudent2.displayDetails();

        colStudent2.setGrade("D");

        System.out.println("Studnet Name: " + colStudent2.getName());
        System.out.println("Studnet Grade: " + colStudent2.getGrade());


    }
}
