package Week1.OopsEx.Student;

//Student Grades (Encapsulation)
//Student class with private fields name, grade.
//Use getter/setter with validation (A–F only).
//Display details.

public class Student {
    private String name;
    private String grade;


    // constructor
    public Student(String name, String grade) {
        this.name = name;
        setGrade(grade);
    }

    public String getName() {return name;}
    public String getGrade() {return grade;}

    public void setName(String name) {
        this.name = name;
    }
    public void setGrade(String grade) {
        if(
                grade.equalsIgnoreCase("A") ||
                grade.equalsIgnoreCase("B") ||
                grade.equalsIgnoreCase("C") ||
                grade.equalsIgnoreCase("D") ||
                grade.equalsIgnoreCase("E") ||
                grade.equalsIgnoreCase("F")
        ) {
            this.grade = grade.toUpperCase();
        } else {
            System.out.println("Please enter proper Grade from A TO F. Grade set to default C");
            this.grade = "C";
        }
    }

    public String toString() {
        return "Student name is " + name + " and his Grade is " + grade;
    }
}
