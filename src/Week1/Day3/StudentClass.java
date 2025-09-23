package Week1.Day3;

public class StudentClass {
    String name;
    int age;
    String grade;

    // constructor
    public StudentClass(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public void displayDetails() {
        System.out.println("Student name is " + name + " and at " + age + ". He got \"" + grade + "\" grade");
    }

    public static void main(String[] args) {
        StudentClass studentOne = new StudentClass("Phani", 21, "A");
        StudentClass studentTwo = new StudentClass("Pawan", 20, "B");

        studentOne.displayDetails();
        studentTwo.displayDetails();
    }
}
