package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    static public void main(String... args) {
        // create List as view
        Integer[] myArr = {1, 2, 3, 4, 5};
        List<Integer> intList = Arrays.asList(myArr);
        intList.set(0, 11);
        myArr[1] = 22;
        // the changes to either the array or List affect both
        System.out.println(Arrays.toString(myArr));
        System.out.println(intList);


        // create List independently
        Integer[] myArrTwo = {1, 2, 3, 4, 5};
        List<Integer> intListTwo = new ArrayList<>(Arrays.asList(myArrTwo));
        intListTwo.set(0, 11);
        myArrTwo[1] = 22;
        // the changes to either the array or List are independent
        System.out.println(Arrays.toString(myArrTwo));
        System.out.println(intListTwo);
    }
}