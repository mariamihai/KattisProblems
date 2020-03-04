package difficulty_2.difficulty_2_4.anthonyAndDiablo;

import java.util.Scanner;

public class AnthonyAndDiablo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double n = scanner.nextDouble();

        // Constructing fencing from available data
        double radius = n / (2 * Math.PI);
        double calculatedArea = Math.PI * radius * radius;

        if (calculatedArea > a) System.out.println("Diablo is happy!");
        else System.out.println("Need more materials!");

        scanner.close();
    }
}
