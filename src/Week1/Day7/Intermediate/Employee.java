package Week1.Day7.Intermediate;

import java.util.HashMap;
import java.util.Map;

//Create a HashMap of employee IDs and names. Print only the keys.
public class Employee {
    public static void main(String[] args) {
        String[] empData = {"John Wick", "Jason Burn", "Jason Sthatam"};

        Map<String, String> employees = new HashMap<>();
        for(int i=0; i<empData.length; i++) {
            employees.put("EMP" + (i + 1), empData[i]);
        }

//        for(String empId: employees.keySet()) {
//            System.out.println("Employee ID: " + empId);
//        }
//        for(Map.Entry<String, String> emp: employees.entrySet()){
//            System.out.println("Employee ID: " + emp.getKey());
//        }
        for(String empId: employees.keySet()){
            System.out.println("Employee ID: " + empId);
        }
    }
}
