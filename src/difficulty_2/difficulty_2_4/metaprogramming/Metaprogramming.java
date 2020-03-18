package difficulty_2.difficulty_2_4.metaprogramming;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Metaprogramming {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> integers = new HashMap<>();
        while(scanner.hasNext()) {
            String line = scanner.nextLine();

            if(isDefinitionOfInteger(line)) {
                integers.put(getKey(line), getValue(line));
            } else {
                Integer firstValue = getFirstValue(integers, line);
                Integer secondValue = getSecondValue(integers, line);

                if(isOneValueUndefined(firstValue, secondValue)) {
                    System.out.println("undefined");
                }
                else {
                    System.out.println(compareValues(firstValue, secondValue, getComparisonCommand(line)));
                }
            }
        }

        scanner.close();
    }

    private static boolean isDefinitionOfInteger(String line) {
        return line.contains("define");
    }

    private static String getKey(String line) {
        return line.split(" ")[2];
    }

    private static Integer getValue(String line) {
        return Integer.valueOf(line.split(" ")[1]);
    }

    private static Integer getFirstValue(Map<String, Integer> integers, String line) {
        return integers.get(line.split(" ")[1]);
    }

    private static Integer getSecondValue(Map<String, Integer> integers, String line) {
        return integers.get(line.split(" ")[3]);
    }

    private static String getComparisonCommand(String line) {
        return line.split(" ")[2];
    }

    private static boolean isOneValueUndefined(Integer value1, Integer value2) {
        return value1 == null || value2 == null;
    }

    private static String compareValues(Integer value1, Integer value2, String comparisonCommand) {
        switch (comparisonCommand) {
            case ">": return String.valueOf(value1 > value2);
            case "<": return String.valueOf(value1 < value2);
            default: return String.valueOf(value1.equals(value2));
        }
    }
}
