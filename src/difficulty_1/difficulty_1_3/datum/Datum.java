package difficulty_1.difficulty_1_3.datum;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Datum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day = scanner.nextInt();
        int month = scanner.nextInt();

        LocalDate date = LocalDate.of(2009, month, day);
        String dayOfWeek = date.getDayOfWeek().toString();
        System.out.println(dayOfWeek.charAt(0) + dayOfWeek.substring(1).toLowerCase());
    }
}
