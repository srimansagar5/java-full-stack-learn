package Week1.Day7.Intermediate;

import java.util.ArrayList;
import java.util.List;

//Store 10 integers in an ArrayList, then print only even numbers.
public class EvenNumbers {
    public static void main(String[] args) {
        int maxNumber = 10;

        List<Integer> arrayList = new ArrayList<>();
        for(int i=0; i<maxNumber; i++) {
            arrayList.add(i+1);
        }
        System.out.println("arrayList elements: " + arrayList);

        for(Integer num: arrayList) {
            if(num%2 == 0){
                System.out.println("Even number from arrayList: " + num);
            }
        }
        //java 8+
        arrayList.stream()
                .filter(num -> num %2==0)
                .forEach(num -> System.out.println("Even number from arraList: " + num));
    }
}
