package Week1.Day4;

public class StudentEncap {
    // fields should be private
    // To access private fields, provide public get and set methods.
    // get return value and set update the value.

    private String surname;
    private String name;
    public int totalMarks;

    // constructor
    public StudentEncap(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public String getFullName() {
        return surname + " " + name;
    }

    public void setFullName(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    public static void main(String[] args) {
        StudentEncap studentObj = new StudentEncap(580);

        studentObj.setFullName("Bruce", "Wayne");

        System.out.println("Student Full Name: " + studentObj.getFullName());
        System.out.println("Student Total Marks: " + studentObj.totalMarks);

    }

}
