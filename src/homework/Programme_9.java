package homework;

import java.util.HashMap;
import java.util.Map;

public class Programme_9 {
    /**
     * Create a HashMap object called people that will store String keys and Integer
     * values: And use for each loop to iterate the value from Map.
     */
    public static void main(String[] args) {
        Map<String, Integer> people = new HashMap();
        people.put("Smith", 25);
        people.put("John",  20);
        people.put("Raj", 22);
        people.put("Anna", 21);

        System.out.println("Ages of the people in the map");
        for (Integer age :people.values()){
            System.out.println(age);

        }
    }
}
