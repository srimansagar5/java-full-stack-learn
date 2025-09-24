package Week1.Day4;

public class StudentDetails {
    public static void main(String[] args) {
        StudentEncap studentData = new StudentEncap(417);

        System.out.println("Student Marks: " + studentData.totalMarks);

        studentData.setFullName("Wick", "John");
        System.out.println("Student Fullname: " + studentData.getFullName());
    }
}
