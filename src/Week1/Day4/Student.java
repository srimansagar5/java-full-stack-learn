package Week1.Day4;

public class Student {
    // fields: private
    // to access and update: set and get.
    // getter: return value, setting: set the values;

//    Challenge 2: Student Report Card
//    Create a Student class with private fields: name, grade.
//    Use getters and setters to control access.
//            Setter for grade should only accept values from A to F.
//    Add a method displayDetails() that prints student info.

    private String name;
    private String grade;

    //constructor
    public Student(String name, String grade) {
        this.name = name;
        setGrade(grade);
    }

    // getter
    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        if(grade.equals("A") || grade.equals("B") || grade.equals("C") || grade.equals("D") || grade.equals("E") || grade.equals("F")) {
            this.grade = grade;
        } else {
            System.out.println("Invalid grade! Only A-F allowed.");
            this.grade = "N/A";
        }
    }
    public void displayDetails() {
        System.out.println("Student Name: " + name + " Grade: " + grade);
    }
    public static void main(String[] args) {
        Student ColStudent = new Student("Robert", "B");
        ColStudent.displayDetails();
    }
}
