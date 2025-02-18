package homework;

import java.util.HashSet;

public class Programme_8_Hashset {
    /**
     * Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
     * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
     * else)
     */
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet();
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        //Check which number is between the 1 and 10 are in the set
        System.out.println("Checking the number between 1 and 10");
        for (int i = 1; i<=10; i++){
            if (numbers.contains(i)){
                System.out.println(i + " is in the set.");
            } else {
                System.out.println(i + " is not in the set");
            }
        }
    }
}
