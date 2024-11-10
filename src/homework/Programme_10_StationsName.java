package homework;

import java.util.*;

public class Programme_10_StationsName {
    /**
     * Write a programme that tells you which line passes through particular stations.
     * Just use Zone 1 stations name.
     */
    public static void main(String[] args) {
        Map<String, List<String>> stationLines = new HashMap<>();
        stationLines.put("Baker Street", Arrays.asList("Bakerloo", "Circle", "Hammersmith & City", "Jubilee", "Metropolitan"));
        stationLines.put("Oxford Circus", Arrays.asList("Bakerloo", "Central", "Victoria"));
        stationLines.put("Kings Cross St Pancras", Arrays.asList("Circle", "Hammersmith & City", "Metropolitan", "Northern", "Piccadilly", "Victoria"));
        stationLines.put("Victoria", Arrays.asList("Circle", "District", "Victoria"));
        stationLines.put("Piccadilly Circus", Arrays.asList("Bakerloo", "Piccadilly"));
        stationLines.put("Waterloo", Arrays.asList("Bakerloo", "Jubilee", "Northern", "Waterloo & City"));
        stationLines.put("Liverpool Street", Arrays.asList("Central", "Circle", "Hammersmith & City", "Metropolitan"));
        stationLines.put("Green Park", Arrays.asList("Jubilee", "Piccadilly", "Victoria"));
        stationLines.put("Charing Cross", Arrays.asList("Bakerloo", "Northern"));
        stationLines.put("London Bridge", Arrays.asList("Jubilee", "Northern"));

        //Scanner declaration to reading the input from the console
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the station name to find the lines that pass through it (Zone 1): ");
        String stationName = scanner.nextLine();

        List<String> lines = stationLines.get(stationName);

        if (lines != null) {
            System.out.println("Lines passing through " + stationName + ": " + String.join(", ", lines));
        } else {
            System.out.println("Station not found in Zone 1 or the station name is incorrect.");
        }

        scanner.close();
    }
}