package homework;

import java.util.ArrayList;

/**
 * Write a Java program to test if an array list is empty or not
 */

public class Programme_7_ArrayListEmptyOrNot {
    public static void main(String[] args) {

        ArrayList<String> coloursList = new ArrayList();
        coloursList.add("White");
        coloursList.add("Black");
        coloursList.add("Pink");
        coloursList.add("Red");
        coloursList.add("Blue");
        coloursList.add("Purple");

        System.out.println("Print colours list: " + coloursList);
        System.out.println("Checking the above array list is empty or not! " + coloursList.isEmpty());
        coloursList.removeAll(coloursList);

        System.out.println("Array list after remove all" + coloursList);
        System.out.println("Checking the above array list is empty or not! " + coloursList.isEmpty());


    }
}