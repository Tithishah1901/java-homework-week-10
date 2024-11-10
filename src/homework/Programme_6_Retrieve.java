package homework;

import java.util.ArrayList;

public class Programme_6_Retrieve {
    /**
     * Write a Java program to retrieve an element (at a specified index) from a given
     * array list
     */

    public static void main(String[] args) {
        ArrayList<String> colourList = new ArrayList();
        colourList.add("Blue");
        colourList.add("Pink");
        colourList.add("Purple");
        colourList.add("Red");
        colourList.add("Orange");


        System.out.println(colourList.size());
        System.out.println(colourList.get(4));
    }
}
