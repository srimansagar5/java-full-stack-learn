package Week1.Day3;

public class Calculator {

    //Methods: add, subtract, multiply, divide
    //Each method should take two numbers and return the result
    public int add(int value1, int value2) {
        return  value1 + value2;
    }
    public int subtract(int value1, int value2) {
        return  value1 - value2;
    }
    public int multiply(int value1, int value2) {
        return  value1 * value2;
    }
    public double divide(int value1, int value2) {
        if (value2 == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }
        return (double) value1/value2;

    }

    //Test the methods with different inputs;
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();

        System.out.println("Add: " + myCalculator.add(10, 5));
        System.out.println("Subtract: " + myCalculator.subtract(10, 5));
        System.out.println("Multiply: " + myCalculator.multiply(10, 5));
        System.out.println("Divide: " + myCalculator.divide(10,5));
        System.out.println("Divide: " + myCalculator.divide(10,0));
        System.out.println("Divide: " + myCalculator.add(-10, -5));

    }


}
