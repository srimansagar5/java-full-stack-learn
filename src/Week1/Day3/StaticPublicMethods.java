package Week1.Day3;

public class StaticPublicMethods {
    int age = 40;
    String name = "Sagar";

    static void displayAge(int ageArg) {
        System.out.println("My age is " + ageArg);
    }

    public  void displayName(String nameArg) {
        System.out.println("My name is " + nameArg);
    }

    public static void main(String[] args) {

        StaticPublicMethods myNameObj = new StaticPublicMethods();
        displayAge(myNameObj.age);

        System.out.println(myNameObj.age);
        System.out.println(myNameObj.name);
        myNameObj.displayName(myNameObj.name);
    }
}
