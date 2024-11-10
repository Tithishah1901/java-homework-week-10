package homework;

/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterator.
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Programme_5_Iterator {

    public static void main(String[] args) {
        Map<Integer, String> coloursList = new HashMap();
        coloursList.put(1, "White");
        coloursList.put(2, "Black");
        coloursList.put(3, "Pink");
        coloursList.put(4, "Red");
        coloursList.put(5, "Purple");

        System.out.println(coloursList);

        for (Map.Entry<Integer, String> colour : coloursList.entrySet()) {
            System.out.println(colour.getKey() + " " + colour.getValue());
        }
        Iterator<Map.Entry<Integer, String>> colourList = coloursList.entrySet().iterator();
        while (colourList.hasNext()) {
            System.out.println(colourList.next());
        }

    }

}


