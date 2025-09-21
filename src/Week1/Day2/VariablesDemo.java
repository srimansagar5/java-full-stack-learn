package Week1.Day2;

public class VariablesDemo {
    public static void main (String[] args) {
        String name = "Vidya";
        int age = 40;
        double salary = 1.25;
        boolean isDeveloper = true;

        System.out.println("I'm " + name + ", turned " + age + " recently. My Salary is " + salary + " lakh per month. I'll be JAVA developer soon " + isDeveloper );

        String studentName = "Sagar";
        char grade = 'A';
        int studentAge = 21;
        double percentage = 78.34;
        boolean isPassed = true;

        System.out.println("My student " + studentName + " at the age " + studentAge + ". He got " + percentage + " percent marks and " + grade +" in degree and successfuly passed " + isPassed);

        // Employee Bio
        String  empName = "Vidya Sagar";
        int empAge = 40;
        boolean isMarried = true;
        final int empBirthYear = 1985;
        final int empDate = 2;
        final String empBirthMonth = "August";
        char empGrade = 'A';
        float empNumber = 2_288;

        System.out.println("My name is " + empName);
        System.out.println("I'm at " + empAge);
        System.out.println("Married " + isMarried);
        System.out.println(" Date of Birth " + empDate + "nd of " + empBirthMonth + " in " + empBirthYear);
        System.out.println("Grade " + empGrade + " Number " + empNumber);




    }
}
