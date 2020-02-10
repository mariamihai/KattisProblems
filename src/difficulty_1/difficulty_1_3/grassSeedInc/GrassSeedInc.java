package difficulty_1.difficulty_1_3.grassSeedInc;

import java.util.Scanner;

public class GrassSeedInc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double costPerSquare = scanner.nextDouble();
        int count = scanner.nextInt();

        double sum = 0;

        for(int i = 0; i < count; i++) {
            double w = scanner.nextDouble();
            double l = scanner.nextDouble();

            sum += w * l * costPerSquare;
        }

        System.out.println(sum);
    }
}
