package Week1.Day2;

public class ControlFlowDemo {
    public  static  void main(String[] args) {
        System.out.println("Welcome to conditions if and switch");
        int number = 10;
        for(int i=0; i<number; i++) {
            if(i == 0){
                System.out.println("It's Zero");
            } else if(i%2 == 0) {
                System.out.println("Even Number: " + i);
            } else {
                System.out.println("Odd Number: " + i);
            }
        }

        int today = 4;

        switch (today) {
            case 1:
                System.out.println("Sunday");
                break;
            case  2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Some day in week");
                break;
        }
    }
}
