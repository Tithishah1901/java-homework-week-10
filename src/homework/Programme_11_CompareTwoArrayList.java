package homework;

import java.util.ArrayList;

public class Programme_11_CompareTwoArrayList {
    /**
     * Declare following two arrylist and compare it.
     * ArrayList<String> c1= new ArrayList<String>();
     * c1.add("Red");
     * c1.add("Green");
     * c1.add("Black");
     * c1.add("White");
     * c1.add("Pink");
     * ArrayList<String> c2= new ArrayList<String>();
     * c2.add("Red");
     * c2.add("Green");
     * c2.add("Black");
     * c2.add("Pink");
     */
    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");


        ArrayList<String> c2= new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        ArrayList<String> c3 = new ArrayList();
        for (String e : c1)
            c3.add(c2.contains(e) ? "Yes" : "No");
        System.out.println(c3);
    }
}
