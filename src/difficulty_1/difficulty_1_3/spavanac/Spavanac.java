package difficulty_1.difficulty_1_3.spavanac;

import java.time.LocalTime;
import java.util.Scanner;

public class Spavanac {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();

        LocalTime time = LocalTime.of(h, m);
        LocalTime newTime = time.minusMinutes(45);

        System.out.println(newTime.getHour() + " " + newTime.getMinute());
    }
}
