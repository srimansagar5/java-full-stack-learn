package Week1.Day3;

public class javaMethods {
    static void myName() {
        String name = "Sagar";
        System.out.println("My name is " + name);
    }

    static void averageValue(int val1, int val2) {
        float avg = (val1 + val2)/2;
        System.out.println("Average of two number " + avg);
    }

    static void numberPattern(int myNum) {
        if(myNum == 0){
            System.out.println("No Stars");
        } else {
            for(int i=1; i< myNum; i++){
                for(int j=0; j< i; j++) {
                    System.out.println("*");
                }

            }

        }

    }

    public static void main(String[] args) {
        int v1 = 25;
        int v2 = 35;
        myName();
        averageValue(v1, v2);
        numberPattern(5);

    }
}
