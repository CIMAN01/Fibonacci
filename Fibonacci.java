/*

Fibonacci sequence

*/

import java.util.ArrayList;
import java.util.List;

// main class
public class Fibonacci {

    // a method that generates the fibonacci sequence
    public static List fibonacciGenerator(int n) {
        // create a new Arraylist
        List<Integer> arrList = new ArrayList<>();
        // if n only has one value
        if(n==1) {
            // create an array with only one element with a value of 0 only
            arrList.add(0);
        }
        // or, if n only has two values
        else if(n==2) {
            // create an array with only two elements with values of 0 and 1 only
            arrList.add(0);
            arrList.add(1);
        }
        // but, if n is larger than two values
        else {
            // create the base array
            arrList.add(0);
            arrList.add(1);
            // as long as there are more numbers to process
            for (int i = 2; i < n; i++) {
                // combine the values of the previous two indices and add it to the array
                arrList.add(arrList.get(arrList.size() - 1)  + arrList.get(arrList.size() - 2));
            }
        }
        return arrList;
    }

    // main method
    public static void main(String[] args) {
        int num = 5;
        System.out.println(fibonacciGenerator(num));
    }
}
