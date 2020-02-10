package difficulty_1.difficulty_1_4.avion;

import java.util.Scanner;

public class Avion {

    private static String fbi = "FBI";
    private static String free = "HE GOT AWAY!";

    public static void main (String[] args) {
        StringBuilder result = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        for(int i = 1; i <= 5; i++) {
            String line = scanner.nextLine();

            if(line.contains(fbi)) result.append(i).append(" ");
        }

        if(result.length() == 0) {
            result.append(free);
        }

        System.out.println(result);
    }
}
