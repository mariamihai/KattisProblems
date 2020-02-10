package difficulty_1.difficulty_1_3.qualityAdjustedLifeYear;

import java.util.Scanner;

public class QALY {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        double sum = 0.00;
        for(int i = 0; i < count; i++) {
            double quality = scanner.nextDouble();
            double time = scanner.nextDouble();
            sum += quality * time;
        }
        System.out.println(sum);

        scanner.close();
    }
}
