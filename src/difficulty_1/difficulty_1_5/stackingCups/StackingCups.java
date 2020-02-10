package difficulty_1.difficulty_1_5.stackingCups;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class StackingCups {

    private static Map<Integer, String> map = new TreeMap<>();

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int radius;
        String color;

        for(int i = 0; i < n; i++) {
            String s1 = scanner.next();
            String s2 = scanner.next();

            try {
                radius = Integer.parseInt(s1) / 2;
                color = s2;
            } catch (NumberFormatException e) {
                radius = Integer.parseInt(s2);
                color = s1;
            }

            map.put(radius, color);
        }

        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
