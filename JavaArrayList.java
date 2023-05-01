// ArrayList 
// give more access to the array

import java.util.ArrayList;
import java.util.Collections;

public class JavaArrayList {
    public static void main(String args[]) {

        // creating array list
        ArrayList<String> names = new ArrayList<String>(); // Integer etc.

        // adding element to arraylist
        names.add("Reyna");
        names.add("jet");
        names.add("chmber");

        // setting element of arraylist
        // names.set(0, "sage");

        // remove element from array
        // numbers.remove(0); // pass index of element to remove

        // remove all element of array
        // numbers.clear();

        // numbers.size(); // return size of array

        // loop through array
        System.out.println("--------------");
        for (String i : names) {
            System.out.println(i);
        }

        // Collection class include sort method
        Collections.sort(names);

        System.out.println("--------------");
        for (String i : names) {
            System.out.println(i);
        }

        System.out.println("---------------");
    }
}
