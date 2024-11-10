package homework;

import java.util.ArrayList;

public class Programme_4_ArrayList {

    /**
     * Write a Java program to create a new array list, add some colours (string) and
     * printout the collection using for each loop.
     */

    //array
    int[] a = new int[5];

    public static void main(String[] args) {

        ArrayList <String> coloursList = new ArrayList();
        coloursList.add("White");
        coloursList.add("Black");
        coloursList.add("Pink");
        coloursList.add("Red");
        coloursList.add("Blue");
        coloursList.add("Purple");

        System.out.println("Colours list");

        for (String colour : coloursList){
            System.out.println(colour);
        }


    }

}
