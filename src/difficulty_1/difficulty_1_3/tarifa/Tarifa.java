package difficulty_1.difficulty_1_3.tarifa;

import java.util.Scanner;

public class Tarifa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int xMegas = scanner.nextInt();
        int nrOfMonths = scanner.nextInt();

        long sum = 0;
        for(int i = 0; i < nrOfMonths; i++) {
            sum += scanner.nextInt();
        }

        System.out.println(nrOfMonths*xMegas - sum + xMegas);
    }
}
