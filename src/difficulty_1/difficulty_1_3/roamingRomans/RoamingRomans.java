package difficulty_1.difficulty_1_3.roamingRomans;

import java.util.Scanner;

public class RoamingRomans {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nr = scanner.nextDouble();

        System.out.println(Math.round(nr *  1000 * 5280 / 4854));
    }
}