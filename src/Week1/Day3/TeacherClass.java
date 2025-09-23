package Week1.Day3;

public class TeacherClass {
    String teacherName = "Bhavani";
    String teacherUserName = "bhavani123";
    String teacherSubject = "English";
    int classesPerDay = 2;
    boolean regular = true;

    static void teacherJob(boolean jobType) {
        System.out.println("Does Her Job type Regular? " + jobType);
    }

    public void userName(String uname) {
        System.out.println("This teacher username is " + uname);
    }

    public static void main(String[] args) {
        TeacherClass teacherDetails = new TeacherClass();
        TeacherClass privateTeacherDetails = new TeacherClass();


        System.out.println("Teacher name and job types are " + teacherDetails.teacherName + ", Regular: " + teacherDetails.regular);
        teacherJob(teacherDetails.regular);
        teacherDetails.userName(teacherDetails.teacherUserName);

        privateTeacherDetails.classesPerDay = 2 * teacherDetails.classesPerDay;
        System.out.println("Regular Teacher classes " + teacherDetails.classesPerDay);
        System.out.println("Private Teacher classes " + privateTeacherDetails.classesPerDay);

    }


}
