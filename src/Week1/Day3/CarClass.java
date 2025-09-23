package Week1.Day3;

public class CarClass {
    int modalYear;
    String modalName;

    public CarClass(String modalName) {
        this(2020, modalName);
    }

    public CarClass(int modalYear, String modalName) {
        this.modalYear = modalYear;
        this.modalName = modalName;
    }

    public void printInfo() {
        System.out.println(modalName + " " + modalYear);
    }

    public static void main(String[] args) {
        CarClass carOne = new CarClass("Corvette");

        CarClass carTwo = new CarClass(1969, "Mustang");

        carOne.printInfo();
        carTwo.printInfo();
    }


}
