package difficulty_1.difficulty_1_3.heartRate;

import java.util.Scanner;

public class HeartRate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nrTests = scanner.nextInt();
        for(int i = 0; i < nrTests; i++) {
            int b = scanner.nextInt();
            double p = scanner.nextDouble();
            double bpm = 60 * b / p;
            System.out.println((bpm - 60 / p) + " " + bpm + " " + (bpm + 60 / p));
        }
    }
}
